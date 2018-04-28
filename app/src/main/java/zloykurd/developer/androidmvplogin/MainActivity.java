package zloykurd.developer.androidmvplogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import zloykurd.developer.androidmvplogin.Presenter.ILoginPresenter;
import zloykurd.developer.androidmvplogin.Presenter.LoginPresenter;
import zloykurd.developer.androidmvplogin.Views.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView{
    EditText mEmail,mPassword;
    Button mButton;
    ILoginPresenter mILoginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         mEmail =(EditText) findViewById(R.id.et_Email);
         mPassword =(EditText) findViewById(R.id.et_Password);
         mButton =(Button) findViewById(R.id.btnEnter);

         mILoginPresenter = new LoginPresenter(this);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mILoginPresenter.onLogin(mEmail.getText().toString(),mPassword.getText().toString());
            }
        });
    }

    @Override
    public void onLoginResult(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
