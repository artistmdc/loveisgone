package cn.mdc.springframework.beans;

/**
 * TODO
 *
 * @author maodc
 * @date 2022/1/3 下午1:01
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
