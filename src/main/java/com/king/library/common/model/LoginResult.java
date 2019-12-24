package com.king.library.common.model;

/**
 * @date: 2019/12/23 17:37
 * @author: duanyong
 * @desc:
 */
public class LoginResult {
    private boolean isLogin = false;
    private String result;

    public LoginResult() {
    }
    public LoginResult(boolean isLogin) {
        this.isLogin = isLogin;
    }
    public LoginResult(boolean isLogin,String result) {
        this.isLogin = isLogin;
        this.result = result;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
