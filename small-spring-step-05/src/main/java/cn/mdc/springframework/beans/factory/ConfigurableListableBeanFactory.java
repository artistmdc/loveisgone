package cn.mdc.springframework.beans.factory;

import cn.mdc.springframework.beans.BeansException;
import cn.mdc.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.mdc.springframework.beans.factory.config.BeanDefinition;
import cn.mdc.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * TODO
 *
 * @author maodc
 * @version 1.0
 * @Description
 * @company
 * @date 2022/1/9 上午9:18
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
