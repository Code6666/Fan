package com.link.component_splash.app

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import com.alibaba.android.arouter.facade.annotation.Route
import com.link.component_splash.R
import com.link.component_splash.SplashViewModelFactory
import com.link.component_splash.databinding.ActivitySplashBinding
import com.link.librarycomponent.router.RouterConstant
import com.link.librarymodule.BR
import com.link.librarymodule.base.mvvm.view.BaseActivity

/**
 * @author WJ
 * @date 2019-05-29
 *
 * 描述：闪屏页
 */
@Route(path = RouterConstant.SPLASH)
class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>() {

    override fun setLayout(savedInstanceState: Bundle?): Int {
        return R.layout.activity_splash
    }

    override fun initVariableId(): Int {
        return BR.viewModel
    }

    override fun initViewModel(): SplashViewModel? {
        val factory = SplashViewModelFactory.getInstance(application)
        return ViewModelProviders.of(this, factory).get(SplashViewModel::class.java)
    }


    override fun initViewObservable() {
        super.initViewObservable()

    }
}
