package online.wenmeng.exception;

/**
 * @Auther: 狼芒
 * @Date: 2021/1/28 1:28
 * @Descrintion: 自定义异常类
 * @version: 1.0
 */
public class sysException extends Exception{
    public sysException(String message) {
        this.message = message;
    }

    //存储提示信息
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
