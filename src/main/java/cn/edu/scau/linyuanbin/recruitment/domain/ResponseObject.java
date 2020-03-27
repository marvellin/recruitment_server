package cn.edu.scau.linyuanbin.recruitment.domain;


/**
 * @Author: linyuanbin
 * @Description:统一后台返回的数据格式
 * @Date: Created in 17:18 2020/3/23
 */
public class ResponseObject {
    public static final Integer OK = 200;
    public static final Integer ERROR = 500;

    private Integer code;
    private String msg;
    private Object object;

    public ResponseObject(Integer code, String msg, Object object) {
        this.code = code;
        this.msg = msg;
        this.object = object;
    }

    public ResponseObject() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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
