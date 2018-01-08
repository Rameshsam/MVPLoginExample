package fbfriendlistexample.com.mvpsample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import fbfriendlistexample.com.mvpsample.R;
import fbfriendlistexample.com.mvpsample.presenter.LoginPresentImple;
import fbfriendlistexample.com.mvpsample.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {

    LoginPresentImple loginPresentImple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginPresentImple = new LoginPresentImple(this);
        loginPresentImple.validateCredentials("","");
    }

    @Override
    public void onSuccess() {
        Toast.makeText(this, "Success", Toast.LENGTH_LONG).show();
    }

    @Override
    public void validateinformation() {
        Toast.makeText(this, "invalid email or password", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFailure() {
        Toast.makeText(this, "Failure", Toast.LENGTH_LONG).show();
    }
}
