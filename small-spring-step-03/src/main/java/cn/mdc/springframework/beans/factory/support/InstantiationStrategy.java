package cn.mdc.springframework.beans.factory.support;

import cn.mdc.springframework.beans.BeansException;
import cn.mdc.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * TODO
 *
 * @author maodc
 * @version 1.0
 * @Description
 * @company
 * @date 2022/1/3 下午1:32
 */
public interface InstantiationStrategy {

    Object instantiate(String beanName, BeanDefinition beanDefinition, Constructor ctor, Object[] args) throws BeansException;

}
