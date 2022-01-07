package cn.mdc.springframework.test;

import cn.mdc.springframework.beans.PropertyValue;
import cn.mdc.springframework.beans.PropertyValues;
import cn.mdc.springframework.beans.factory.config.BeanDefinition;
import cn.mdc.springframework.beans.factory.config.BeanReference;
import cn.mdc.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.mdc.springframework.test.bean.UserDao;
import cn.mdc.springframework.test.bean.UserService;

/**
 * TODO
 *
 * @author maodc
 * @date 2022/1/7 下午8:55
 */
public class ApiTest {

    public static void main(String[] args) {

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        factory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        factory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) factory.getBean("userService");
        userService.queryInfo();

    }
}
