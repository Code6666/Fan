package com.link.librarycomponent.service.main

import android.os.Bundle
import androidx.fragment.app.Fragment

interface IMainService {

    fun newMainFragment(bundle: Bundle?):Fragment?
    fun newShoppingFragment(bundle: Bundle?):Fragment?
    fun newCatalogFragment(bundle: Bundle?):Fragment?
    fun newFindFragment(bundle: Bundle?):Fragment?

}