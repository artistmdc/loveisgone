package cn.mdc.springframework.beans.factory.support;

import cn.mdc.springframework.beans.BeansException;
import cn.mdc.springframework.beans.factory.config.BeanDefinition;

/**
 * TODO
 *
 * @author maodc
 * @version 1.0
 * @Description
 * @company
 * @date 2022/1/4 下午10:28
 */
public interface BeanDefinitionRegister {

    /**
     * 向注册表中注册 BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 使用Bean名称获取BeanDefinition
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 获取注册表中所有的Bean名称
     * @return
     */
    String[] getBeanDefinitionNames();

}
