package cn.mdc.springframework.beans.factory.support;

import cn.mdc.springframework.beans.BeansException;
import cn.mdc.springframework.core.io.Resource;
import cn.mdc.springframework.core.io.ResourceLoader;

/**
 * TODO
 *
 * @author maodc
 * @version 1.0
 * @Description
 * @company
 * @date 2022/1/9 上午10:14
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegister getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
