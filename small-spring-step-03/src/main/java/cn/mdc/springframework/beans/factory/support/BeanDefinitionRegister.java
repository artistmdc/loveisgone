package cn.mdc.springframework.beans.factory.support;

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

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
