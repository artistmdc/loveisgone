package cn.mdc.springframework.beans.factory.config;

/**
 * TODO
 *
 * @author maodc
 * @version 1.0
 * @Description
 * @company
 * @date 2022/1/3 下午1:09
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
