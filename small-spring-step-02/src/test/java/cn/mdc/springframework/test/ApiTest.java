package cn.mdc.springframework.test;

import cn.mdc.springframework.beans.factory.config.BeanDefinition;
import cn.mdc.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.mdc.springframework.test.bean.UserService;

/**
 * @author maodianchu
 * @ClassName ApiTest
 * @Description
 * @date 2021/12/28 13:02
 */
public class ApiTest {

    public static void main(String[] args) {

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        factory.registerBeanDefinition("userService", beanDefinition);

        UserService s1 = (UserService) factory.getBean("userService");
        s1.queryUser();

        UserService s2 = (UserService) factory.getSingleton("userService");
        s2.queryUser();

    }

}
