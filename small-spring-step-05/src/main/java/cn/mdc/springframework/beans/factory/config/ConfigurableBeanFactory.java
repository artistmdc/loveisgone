package cn.mdc.springframework.beans.factory.config;

import cn.mdc.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * TODO
 *
 * @author maodc
 * @date 2022/1/9 上午9:22
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROPOTYPE = "prototype";

}
