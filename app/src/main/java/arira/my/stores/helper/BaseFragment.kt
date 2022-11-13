package arira.my.stores.helper

import android.view.View
import androidx.fragment.app.Fragment
import arira.my.stores.helper.HelperToast

open class BaseFragment : Fragment(){

    lateinit var root: View
    var toast = HelperToast()
    
}