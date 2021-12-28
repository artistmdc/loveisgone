package cn.mdc.springframework.test;

import cn.mdc.springframework.BeanDefinition;
import cn.mdc.springframework.BeanFactory;
import cn.mdc.springframework.test.bean.UserService;

/**
 * @author maodianchu
 * @ClassName ApiTest
 * @Description
 * @date 2021/12/28 12:31
 */
public class ApiTest {

    public static void main(String[] args) {
        /**
         * 1、初始化容器
         * 2、注入bean
         * 3、获取bean
         */

        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUser();
    }

}
