package cn.mdc.springframework;

/**
 * @author maodianchu
 * @ClassName BeanDefinition
 * @Description
 * @date 2021/12/28 12:27
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
