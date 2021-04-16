package cn.gleaners.administrator.utils.response;

/**
 * @author WangDeSheng
 * @date 2020/6/24 15:53
 * description：
 */
public class Response {
    public static ResultData<Object> success() {
        ResultData<Object> resultData = new ResultData<>();
        resultData.setCode(Result.SUCCESS.getCode());
        resultData.setMessage(Result.SUCCESS.getMessage());
        resultData.setData("");
        return resultData;
    }

    public static <T> ResultData<Object> success(T data) {
        ResultData<Object> resultData = new ResultData<>();
        resultData.setCode(Result.SUCCESS.getCode());
        resultData.setMessage(Result.SUCCESS.getMessage());
        resultData.setData(data);
        return resultData;
    }

    public static ResultData<Object> failed() {
        ResultData<Object> resultData = new ResultData<>();
        resultData.setCode(Result.FAILED.getCode());
        resultData.setMessage(Result.FAILED.getMessage());
        resultData.setData("");
        return resultData;
    }

    public static <T> ResultData<Object> failed(Code code, Message msg, T data) {
        ResultData<Object> resultData = new ResultData<>();
        resultData.setCode(code.code());
        resultData.setMessage(msg.msg());
        resultData.setData(data);
        return resultData;
    }


    public static <T> ResultData<Object> failed(Result result, T data) {
        ResultData<Object> resultData = new ResultData<>();
        resultData.setCode(result.getCode());
        resultData.setMessage(result.getMessage());
        resultData.setData(data);
        return resultData;
    }
}
