package cn.mdc.springframework.context.support;

import cn.mdc.springframework.beans.BeansException;
import cn.mdc.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.mdc.springframework.beans.factory.config.BeanFactoryPostProcessor;
import cn.mdc.springframework.beans.factory.config.BeanPostProcessor;
import cn.mdc.springframework.context.ConfigurableApplicationContext;
import cn.mdc.springframework.core.io.DefaultResourceLoader;

import java.util.Map;

/**
 * @author maodianchu
 * @ClassName AbstractApplicationContext
 * @Description
 * @date 2022/1/21 14:19
 */
public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {

    @Override
    public void refresh() throws BeansException {

        refresh();
    }

    protected abstract void refreshBeanFactory() throws BeansException;

    protected abstract ConfigurableListableBeanFactory getBeanFactory();

    private void invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanFactoryPostProcessor> beanFactoryPostProcessorMap = beanFactory.getBeansOfType(BeanFactoryPostProcessor.class);
        for (BeanFactoryPostProcessor beanFactoryPostProcessor : beanFactoryPostProcessorMap.values()) {
            beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        }
    }

    private void registerBeanPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanPostProcessor> beanPostProcessorMap = beanFactory.getBeansOfType(BeanPostProcessor.class);
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorMap.values()) {
            beanFactory.
        }
    }

}
