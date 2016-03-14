package com.smallwei.retrofitdemo;

/**
 * Created by smallwei on 2016/3/14.
 */
public class UserInfo {

    /**
     * code : 102
     * keychain : 123123123123
     * msg : username already exists
     */

    private String code;
    private String keychain;
    private String msg;

    public void setCode(String code) {
        this.code = code;
    }

    public void setKeychain(String keychain) {
        this.keychain = keychain;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getKeychain() {
        return keychain;
    }

    public String getMsg() {
        return msg;
    }
}
