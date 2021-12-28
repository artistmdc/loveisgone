package cn.mdc.springframework.beans.factory.support;

import java.util.HashMap;
import java.util.Map;

/**
 * @author maodianchu
 * @ClassName DefaultSingletonBeanRegistry
 * @Description
 * @date 2021/12/28 12:46
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
