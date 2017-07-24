package com.dasungta.admin.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: zyc77
 * Date: 2017/7/24
 * Time: 15:49
 */

public enum  ResultStatusCode {
    OK(200, "OK"),
    LOGIN_FAILED(101,"Login failed"),
    ACCOUNT_ERR(102,"Account has been deleted or disabled"),
    PERMISSION_DENIED(103,"No permissions"),
    SYSTEM_ERR(30001, "System error");

    private int code;
    private String error;
    public int getErrcode() {
        return code;
    }

    public void setErrcode(int code) {
        this.code = code;
    }

    public String getErrmsg() {
        return error;
    }

    public void setErrmsg(String error) {
        this.error = error;
    }

    private ResultStatusCode(int Errode, String ErrMsg)
    {
        this.code = Errode;
        this.error = ErrMsg;
    }
}
