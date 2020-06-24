package cn.gleaners.administrator.utils.response;

/**
 * @author WangDeSheng
 * @date 2020/6/24 15:53
 * description：
 */
public class Response {
    public static ResultData<Object> Success() {
        ResultData<Object> resultData = new ResultData<>();
        resultData.setCode(Code.SUCCESS);
        resultData.setMessage(Message.SUCCESS);
        resultData.setData("");
        return resultData;
    }

    public static <T> ResultData<Object> Success(T data) {
        ResultData<Object> resultData = new ResultData<>();
        resultData.setCode(Code.SUCCESS);
        resultData.setMessage(Message.SUCCESS);
        resultData.setData(data);
        return resultData;
    }

    public static ResultData<Object> Failed() {
        ResultData<Object> resultData = new ResultData<>();
        resultData.setCode(Code.FAILED);
        resultData.setMessage(Message.FAILED);
        resultData.setData("");
        return resultData;
    }

    public static <T> ResultData<Object> Failed(Code code, Message msg, T data) {
        ResultData<Object> resultData = new ResultData<>();
        resultData.setCode(code);
        resultData.setMessage(msg);
        resultData.setData(data);
        return resultData;
    }
}
