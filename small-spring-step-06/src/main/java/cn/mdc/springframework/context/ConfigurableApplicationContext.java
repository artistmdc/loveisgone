package cn.mdc.springframework.context;

import cn.mdc.springframework.beans.BeansException;

/**
 * @author maodianchu
 * @ClassName ConfigurableApplicationContext
 * @Description
 * @date 2022/1/21 14:18
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

}
