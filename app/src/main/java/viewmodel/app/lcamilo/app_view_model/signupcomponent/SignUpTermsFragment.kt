package viewmodel.app.lcamilo.app_view_model.signupcomponent

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.fragment_sign_up_terms.*
import me.drakeet.materialdialog.MaterialDialog
import viewmodel.app.lcamilo.app_view_model.R


class SignUpTermsFragment : Fragment(), CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater
                .inflate(R.layout.fragment_sign_up_terms, container, false)

        view.findViewById<CheckBox>(R.id.cb_terms)
                .setOnClickListener(this)

        view.findViewById<Button>(R.id.bt_send)
                .setOnClickListener(this)
        return view
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        cb_terms.isEnabled = isChecked;
    }

    override fun onClick(view: View?) {
        val layout = LayoutInflater.from(activity).inflate(R.layout.dialog_personal, null, false)

        MaterialDialog(activity)
                .setContentView(view)
                .setCanceledOnTouchOutside(true).show();

    }
}
