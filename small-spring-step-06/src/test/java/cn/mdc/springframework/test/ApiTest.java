package cn.mdc.springframework.test;

import cn.hutool.core.io.IoUtil;
import cn.mdc.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.mdc.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import cn.mdc.springframework.core.io.DefaultResourceLoader;
import cn.mdc.springframework.core.io.Resource;
import cn.mdc.springframework.core.io.ResourceLoader;
import cn.mdc.springframework.test.bean.UserService;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * TODO
 *
 * @author maodc
 * @date 2022/1/9 上午11:47
 */
public class ApiTest {

    private ResourceLoader resourceLoader;

    @Before
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void test_main() {

    }

    @Test
    public void test_classpath() throws Exception {
        Resource resource = resourceLoader.getResource("classpath:spring.xml");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_file() throws Exception {
        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_url() throws Exception {
        Resource resource = resourceLoader.getResource("https://github.com/artistmdc/loveisgone/blob/main/small-spring-step-05/src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_xml() throws Exception {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        UserService userService = (UserService) factory.getBean("userService");
        userService.queryUserInfo();

    }



}
