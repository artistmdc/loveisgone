package cn.mdc.springframework.beans.factory.factory;

/**
 * TODO
 *
 * @author maodc
 * @date 2022/1/3 下午1:06
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanclass) {
        this.beanClass = beanclass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
