package com.bjpowernode.pojo.vo;

/**
 * 后端发给前端包装数据对象
 */
public class JsonModelVo {
    private Integer code;//转态码
    private String msg;//异常信息
    private Object data;//数据

    @Override
    public String toString() {
        return "JsonModelVo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
