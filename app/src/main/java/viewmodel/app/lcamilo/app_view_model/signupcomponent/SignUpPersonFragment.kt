package viewmodel.app.lcamilo.app_view_model.signupcomponent

import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.makeramen.roundedimageview.RoundedImageView
import kotlinx.android.synthetic.main.fragment_sign_up.*
import me.iwf.photopicker.PhotoPicker
import viewmodel.app.lcamilo.app_view_model.R

/**
 * Created by luiscamilo on 12/11/17.
 */
class SignUpPersonFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false);

        view.findViewById<RoundedImageView>(R.id.iv_profile).setOnClickListener(this);

        return view;
    }

    override fun onClick(view: View?) {
        val photoCount = 1;
        PhotoPicker.builder()
                .setPhotoCount(photoCount)
                .setShowCamera(true)
                .setPreviewEnabled(true).start(activity, PhotoPicker.REQUEST_CODE);
    }

    fun updatePhoto(imagePath: String?) {
        imagePath?.let {
            if (!imagePath.isEmpty()) {
                iv_profile.setImageURI(Uri.parse(imagePath));
            }
        }

    }

}