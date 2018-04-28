package zloykurd.developer.androidmvplogin.Presenter;


import zloykurd.developer.androidmvplogin.Models.User;
import zloykurd.developer.androidmvplogin.Views.ILoginView;

public class LoginPresenter implements ILoginPresenter {

    ILoginView mILoginView;

    public LoginPresenter(ILoginView ILoginView) {
        mILoginView = ILoginView;
    }

    @Override
    public void onLogin(String email, String password) {
        User user = new User(email,password);
        boolean isLoginSuccess = user.isValidData();

        if (isLoginSuccess){
            mILoginView.onLoginResult("Success");
        }else {
            mILoginView.onLoginResult("Error");

        }

    }
}
