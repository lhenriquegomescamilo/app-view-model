package viewmodel.app.lcamilo.app_view_model


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import viewmodel.app.lcamilo.app_view_model.signupcomponent.SignUpActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val buttonLogin = findViewById<Button>(R.id.bt_entrar)
        buttonLogin.setOnClickListener({ view ->
            this.callSignUp(view)
        })
    }

    fun callSignUp(view: View) {
        startActivity(Intent(this, SignUpActivity::class.java))

    }

}
