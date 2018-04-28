package zloykurd.developer.androidmvplogin.Models;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements IUser{

  private String Email,Password;

    public User(String email, String password) {
        this.Email = email;
        this.Password = password;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public String getPassword() {
        return Password;
    }

    @Override
    public boolean isValidData() {

        return !TextUtils.isEmpty(getEmail())
                && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
                && getPassword().length() >6;
    }
}
