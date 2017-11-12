package viewmodel.app.lcamilo.app_view_model.config


import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import viewmodel.app.lcamilo.app_view_model.signupcomponent.SignUpAccessFragment
import viewmodel.app.lcamilo.app_view_model.signupcomponent.SignUpActivity
import viewmodel.app.lcamilo.app_view_model.signupcomponent.SignUpPersonFragment
import viewmodel.app.lcamilo.app_view_model.signupcomponent.SignUpTermsFragment

/**
 * Created by luiscamilo on 12/11/17.
 */
class SectionsPagerAdapter(signUpActivity: SignUpActivity, fragmentManager: FragmentManager) :
        FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            1 -> SignUpPersonFragment()
            2 -> SignUpAccessFragment()
            else -> SignUpTermsFragment()

        }
    }

    override fun getCount(): Int {
        return 3;
    }
}