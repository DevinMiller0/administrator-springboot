package cn.gleaners.administrator.utils.response;

/**
 * @author WangDeSheng
 * @date 2020/6/24 15:46
 * description：
 */
public enum Code {
    SUCCESS(200),
    FAILED(4000),
    UNAUTHORIZED(4001),
    PARAM_ERROR(4002)
    ;

    private int code;

    Code(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}
