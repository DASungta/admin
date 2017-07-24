package com.dasungta.admin.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: zyc77
 * Date: 2017/7/24
 * Time: 15:49
 */

public class ResultMsg {
    private int code;
    private String error;
    private Object data;

    public ResultMsg(int code, String error, Object data)
    {
        this.code = code;
        this.error = error;
        this.data = data;
    }
    public int getcode() {
        return code;
    }
    public void setcode(int code) {
        this.code = code;
    }
    public String geterror() {
        return error;
    }
    public void seterror(String error) {
        this.error = error;
    }
    public Object getData() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
}
