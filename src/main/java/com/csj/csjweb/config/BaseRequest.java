package com.csj.csjweb.config;


public class BaseRequest {

    /***
     * @RequestBody接收参数的对象全部继承baserequest
     */

    protected String echostr; //随机字符串

    protected String timestamp;//时间

    protected String sign;//签名

    protected String encryptstr;//参数加密后的字符串


    public String getEchostr() {
        return echostr;
    }

    public void setEchostr(String echostr) {
        this.echostr = echostr;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getEncryptstr() {
        return encryptstr;
    }

    public void setEncryptstr(String encryptstr) {
        this.encryptstr = encryptstr;
    }
}
