package cn.mdc.springframework.beans.factory.config;

import cn.mdc.springframework.beans.BeansException;
import cn.mdc.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author maodianchu
 * @ClassName BeanFactoryPostProcessor
 * @Description
 * @date 2022/1/21 14:26
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的BeanDefinition加载完成之后，实例化Bean对象之前，提供修改BeanDefinition属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
