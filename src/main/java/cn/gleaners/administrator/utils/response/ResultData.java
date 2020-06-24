package cn.gleaners.administrator.utils.response;

import com.alibaba.fastjson.JSON;

/**
 * @author WangDeSheng
 * @date 2020/6/24 15:39
 * description：
 */
public class ResultData<T> {
    private int code;
    private String message;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code.code();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message.msg();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
