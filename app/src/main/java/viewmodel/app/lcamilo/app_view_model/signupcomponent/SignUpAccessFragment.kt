package viewmodel.app.lcamilo.app_view_model.signupcomponent

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import viewmodel.app.lcamilo.app_view_model.R


class SignUpAccessFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_sign_up_access, container, false);
        return view;
    }

}
