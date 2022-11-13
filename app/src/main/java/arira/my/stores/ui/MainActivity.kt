package arira.my.stores.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import arira.my.id.R
import arira.my.id.databinding.ActivityMainBinding
import arira.my.stores.helper.BaseActivity
import arira.my.stores.helper.viewBinding
import arira.my.stores.ui.fragment.HomeFragment
import arira.my.stores.ui.fragment.MyOrderFragment
import arira.my.stores.ui.fragment.ProfilFragment

class MainActivity : BaseActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)
    lateinit var menu: Menu
    lateinit var menuItem: MenuItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        statusPutih()
        bottomNav()
    }

    private fun callFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_container, fragment)
            .commit()
    }

    private fun bottomNav() {

        val navView: BottomNavigationView = findViewById(R.id.main_nav)
        menu = navView.menu

        supportFragmentManager.beginTransaction().replace(
            R.id.main_container,
            HomeFragment()
        ).commit()

        menuItem = menu.getItem(0)
        menuItem.isChecked = true

        navView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    menuItem = menu.getItem(0)
                    menuItem.isChecked = true
                    callFragment(HomeFragment())

                }
                R.id.navigation_myorder -> {
                    menuItem = menu.getItem(1)
                    menuItem.isChecked = true
                    callFragment(MyOrderFragment())

                }

                R.id.navigation_profil -> {
                    menuItem = menu.getItem(2)
                    menuItem.isChecked = true
                    callFragment(ProfilFragment())
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }

}