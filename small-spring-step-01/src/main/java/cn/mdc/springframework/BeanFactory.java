package cn.mdc.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author maodianchu
 * @ClassName BeanFactory
 * @Description
 * @date 2021/12/28 12:28
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
