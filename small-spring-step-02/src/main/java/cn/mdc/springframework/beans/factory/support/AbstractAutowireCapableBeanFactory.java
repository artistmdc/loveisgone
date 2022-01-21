package cn.mdc.springframework.beans.factory.support;

import cn.mdc.springframework.beans.BeansException;
import cn.mdc.springframework.beans.factory.factory.BeanDefinition;

/**
 * @author maodianchu
 * @ClassName AbstractAutowireCapableBeanFactory
 * @Description
 * @date 2021/12/28 12:54
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean faild", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }
}
