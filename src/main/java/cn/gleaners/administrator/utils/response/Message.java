package cn.gleaners.administrator.utils.response;

/**
 * @author WangDeSheng
 * @date 2020/6/24 15:46
 * description：
 */
public enum Message {
    SUCCESS("success"),
    FAILED("failed"),
    UNAUTHORIZED("登录过期"),
    PARAM_ERROR("param err")
    ;

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String msg() {
        return message;
    }
}
