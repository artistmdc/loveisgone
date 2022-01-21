package cn.mdc.springframework.test;

import cn.mdc.springframework.beans.factory.factory.BeanDefinition;
import cn.mdc.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.mdc.springframework.test.bean.UserService;

/**
 * TODO
 *
 * @author maodc
 * @date 2022/1/4 下午10:20
 */
public class ApiTest {

    public static void main(String[] args) {

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        factory.registerBeanDefinition("userService", new BeanDefinition(UserService.class));

        UserService userService = (UserService) factory.getBean("userService", "阿毛");
        userService.queryUserInfo();
    }
}
