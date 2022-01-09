package cn.mdc.springframework.beans.factory;

import cn.mdc.springframework.beans.BeansException;

import java.util.Map;

/**
 * TODO
 *
 * @author maodc
 * @version 1.0
 * @Description
 * @company
 * @date 2022/1/9 上午9:10
 */
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 按照类型获取 Bean 实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 获取注册表中的所有Bean名称
     * @return
     */
    String[] getBeanDefinitionNames();

}
