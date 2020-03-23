package cn.edu.scau.linyuanbin.recruitment.domain;


/**
 * @Author: linyuanbin
 * @Description:统一后台返回的数据格式
 * @Date: Created in 17:18 2020/3/23
 */
public class ResponseObject {
    private int code;
    private String msg;
    private Object object;

    public ResponseObject(int code, String msg, Object object) {
        this.code = code;
        this.msg = msg;
        this.object = object;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "ResponseObject{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
