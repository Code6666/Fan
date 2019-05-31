package com.link.librarycomponent

open class AppConfig {

    companion object {

        val LOGIN_MODULE = "com.link.component_login.LoginApplication"
        val SPLASH_MODULE = "com.link.component_splash.SplashApplication"

        val moduleApps = arrayOf(LOGIN_MODULE, SPLASH_MODULE)
    }

}