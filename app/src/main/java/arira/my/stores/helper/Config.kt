package arira.my.stores.helper

import android.os.Environment

object Config {
    val extra_model:String = "extraModel"
    val extra_type:String = "extraType"
    val extra_other:String = "extraOther"
    val extra_url:String = "extraUrl"
    val extra_list:String = "extraList"
    val extra_id:String = "extraID"
    val extra_boolean:String = "extra_boolean"

    var DIRECTORY_IMAGE:String = Environment.getExternalStorageDirectory().toString() + "/Kasir Warung/images/"
}