package cn.mdc.springframework.beans.factory.config;

/**
 * @author maodianchu
 * @ClassName BeanDefinitionRegistry
 * @Description
 * @date 2021/12/28 12:58
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
