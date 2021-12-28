package cn.mdc.springframework.beans.factory;

import cn.mdc.springframework.beans.BeansException;

/**
 * @author maodianchu
 * @ClassName BeanFactory
 * @Description
 * @date 2021/12/28 12:42
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
