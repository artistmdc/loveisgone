package cn.mdc.springframework.beans.factory.config;

/**
 * TODO
 *
 * @author maodc
 * @date 2022/1/7 下午8:42
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
