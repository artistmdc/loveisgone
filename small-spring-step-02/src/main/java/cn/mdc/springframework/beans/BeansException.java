package cn.mdc.springframework.beans;

/**
 * @author maodianchu
 * @ClassName BeansException
 * @Description
 * @date 2021/12/28 12:39
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
