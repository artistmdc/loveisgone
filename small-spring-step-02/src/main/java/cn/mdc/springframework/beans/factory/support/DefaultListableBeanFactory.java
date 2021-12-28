package cn.mdc.springframework.beans.factory.support;

import cn.mdc.springframework.beans.BeansException;
import cn.mdc.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author maodianchu
 * @ClassName DefaultListableBeanFactory
 * @Description
 * @date 2021/12/28 12:57
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if(beanDefinition == null) throw new BeansException("No bean name '" + beanName + "' is defined");
        return beanDefinition;
    }

}
