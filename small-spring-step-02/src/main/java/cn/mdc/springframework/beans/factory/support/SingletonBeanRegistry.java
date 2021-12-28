package cn.mdc.springframework.beans.factory.support;

/**
 * @author maodianchu
 * @ClassName SingletonBeanRegistry
 * @Description
 * @date 2021/12/28 12:45
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
