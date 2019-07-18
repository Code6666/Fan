package com.link.component_search.data.source.local

import com.link.component_search.data.source.local.ILocalDataSource
import com.link.librarymodule.BaseApplication
import io.reactivex.Observable
import java.io.IOException

class LocalDataSourceImpl : ILocalDataSource {

    override fun getCatalogData(): Observable<String> {
        var result = ""
        try {
            //获取输入流
            val mAssets = BaseApplication.instance.getAssets().open("catelog.json")
            //获取文件的字节数
            val lenght = mAssets.available()
            //创建byte数组
            val buffer = ByteArray(lenght)
            //将文件中的数据写入到字节数组中
            mAssets.read(buffer)
            mAssets.close()
            result = String(buffer)
            return Observable.just(result)
        } catch (e: IOException) {
            e.printStackTrace()
            return Observable.just(result)
        }
    }


}