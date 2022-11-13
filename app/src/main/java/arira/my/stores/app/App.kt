package arira.my.stores.app

import android.app.Application
import arira.my.stores.helper.Helper
import arira.my.stores.utilities.SharedPref

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        pref = SharedPref(this)


    }
    companion object {
        lateinit var pref: SharedPref
        var helper = Helper
    }
}