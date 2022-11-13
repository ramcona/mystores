package arira.my.stores.utilities

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson

class SharedPref(context : Context) {

    private val mypref = "MAIN_PREF"
    private val sp: SharedPreferences = context.getSharedPreferences(mypref, Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = sp.edit()
    private val onReview = "onReview"
    private val isLogin = "isLogin"
    private val showRating = "showRating"
    private val openApp = "openApp"

    private val songPlay = "songPlay"

    private val userTemp = "userTemp"

    private val notifShowroom = "notifShowroom"
    private val notifNews = "notifNews"
    private val notifMng = "notifMng"
    private val notifEvent = "notifEvent"
    private val notifHandshake = "notifHandshake"
    private val notifStreaming = "notifStreaming"

    private val calenderNewView = "calenderNewView"

    private val token = "token"
    private val users = "users"

    private val fcmToken:String = "fcmToken"

    fun setOnReview(value: Boolean) {
        editor.putBoolean(onReview, value)
        editor.commit()
        editor.apply()
    }

    fun setFCMToken(status : String){
        sp.edit().putString(fcmToken, status).apply()
    }
    fun getFCMToken():String{
        return sp.getString(fcmToken, "") ?: ""
    }

    fun setUserTemp(status : String){
        sp.edit().putString(userTemp, status).apply()
    }
    fun getUserTemp():String{
        return sp.getString(userTemp, "") ?: ""
    }


    fun getOnReview(): Boolean {
        return sp.getBoolean(onReview, true)
    }

    fun setOpenApp(value : Int){
        sp.edit().putInt(openApp, value).apply()
    }

    fun setIsLogin(value : Boolean){
        sp.edit().putBoolean(isLogin, value).apply()
    }

    fun getIsLogin(): Boolean {
        return sp.getBoolean(isLogin, false)
    }

    fun getNewCalender(): Boolean {
        return sp.getBoolean(calenderNewView, false)
    }

    fun setNewCalender(value : Boolean){
        sp.edit().putBoolean(calenderNewView, value).apply()
    }

    fun getNotifShowroom(): Boolean {
        return sp.getBoolean(notifShowroom, true)
    }

    fun setNotifShowroom(value : Boolean){
        sp.edit().putBoolean(notifShowroom, value).apply()
    }

    fun getNotifNews(): Boolean {
        return sp.getBoolean(notifNews, true)
    }

    fun setNotifNews(value : Boolean){
        sp.edit().putBoolean(notifNews, value).apply()
    }

    fun getNotifMng(): Boolean {
        return sp.getBoolean(notifMng, true)
    }

    fun setNotifMng(value : Boolean){
        sp.edit().putBoolean(notifMng, value).apply()
    }

    fun getNotifEvent(): Boolean {
        return sp.getBoolean(notifEvent, true)
    }

    fun setNotifEvent(value : Boolean){
        sp.edit().putBoolean(notifEvent, value).apply()
    }

    fun getNotifHandshake(): Boolean {
        return sp.getBoolean(notifHandshake, true)
    }

    fun setNotifHandshake(value : Boolean){
        sp.edit().putBoolean(notifHandshake, value).apply()
    }

    fun getNotifStreaming(): Boolean {
        return sp.getBoolean(notifStreaming, true)
    }

    fun setNotifStreaming(value : Boolean){
        sp.edit().putBoolean(notifStreaming, value).apply()
    }

    fun getOpenApp() : Int{
        return sp.getInt(openApp, 0)
    }

    fun setRated(value : Boolean){
        sp.edit().putBoolean(showRating, value).apply()
    }

    fun isRated() : Boolean{
        return sp.getBoolean(showRating, false)
    }

    fun clearAll() {
        editor.clear()
        editor.commit()
    }

}