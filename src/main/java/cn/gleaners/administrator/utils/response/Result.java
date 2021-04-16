package cn.gleaners.administrator.utils.response;

/**
 * @author WangDeSheng
 * @date 2021-04-16 13:36
 * description：
 */
public enum Result {

    SUCCESS(200, "success"),
    FAILED(4000, "failed"),
    UNAUTHORIZED(4001, "登录过期"),
    PARAM_ERROR(4002, "param err");

    private String message;
    private int code;

    Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
