package viewmodel.app.lcamilo.app_view_model.signupcomponent

import android.content.Intent
import android.support.v7.app.AppCompatActivity

import android.os.Bundle
import android.support.design.R.id.container
import android.support.design.widget.TabLayout
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_sign_up.*

import me.iwf.photopicker.PhotoPicker
import viewmodel.app.lcamilo.app_view_model.R
import viewmodel.app.lcamilo.app_view_model.config.SectionsPagerAdapter

class SignUpActivity : AppCompatActivity() {

    /**
     * The [android.support.v4.view.PagerAdapter] that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * [android.support.v4.app.FragmentStatePagerAdapter].
     */
    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowCustomEnabled(true)

        mSectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        container.adapter = mSectionsPagerAdapter;

        container.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))

        tabs.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(container))

    }

    override fun onStart() {
        super.onStart()
        toolbar.title = resources.getString(R.string.title_activity_sign_up)
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_sign_up, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId;
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RESULT_OK && requestCode === PhotoPicker.REQUEST_CODE) {
            data.let {
                val photos = data?.getStringArrayListExtra(PhotoPicker.KEY_SELECTED_PHOTOS)
                val fragment = supportFragmentManager
                        .findFragmentByTag("android:switcher:${container.id}:${mSectionsPagerAdapter?.getItemId(0)}")
                        as SignUpPersonFragment

                fragment.updatePhoto(photos?.get(0))
            }
        }
    }

}
