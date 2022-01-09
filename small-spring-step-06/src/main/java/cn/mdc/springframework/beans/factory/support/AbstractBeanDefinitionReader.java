package cn.mdc.springframework.beans.factory.support;

import cn.mdc.springframework.core.io.DefaultResourceLoader;
import cn.mdc.springframework.core.io.ResourceLoader;

/**
 * TODO
 *
 * @author maodc
 * @date 2022/1/9 上午10:34
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegister register;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegister register) {
        this(register, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegister register, ResourceLoader resourceLoader) {
        this.register = register;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegister getRegistry() {
        return register;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
