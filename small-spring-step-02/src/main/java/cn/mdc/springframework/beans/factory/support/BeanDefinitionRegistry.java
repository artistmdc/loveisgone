package cn.mdc.springframework.beans.factory.support;

import cn.mdc.springframework.beans.factory.config.BeanDefinition;

/**
 * @author maodianchu
 * @ClassName BeanDefinitionRegistry
 * @Description
 * @date 2021/12/28 12:58
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
