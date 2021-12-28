package cn.mdc.springframework.beans.factory.config;

/**
 * @author maodianchu
 * @ClassName BeanDefinition
 * @Description
 * @date 2021/12/28 12:44
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
