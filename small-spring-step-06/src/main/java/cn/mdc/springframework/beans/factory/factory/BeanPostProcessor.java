package cn.mdc.springframework.beans.factory.factory;

import cn.mdc.springframework.beans.BeansException;

/**
 * @author maodianchu
 * @ClassName BeanPostProcessor
 * @Description
 * @date 2022/1/21 14:27
 */
public interface BeanPostProcessor {

    /**
     * 在Bean对象执行初始化方式之前，执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在Bean对象执行初始化方式之后，执行此方法
     *
      * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
