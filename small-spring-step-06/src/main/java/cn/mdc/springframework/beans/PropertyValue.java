package cn.mdc.springframework.beans;

/**
 * TODO
 *
 * @author maodc
 * @date 2022/1/7 下午7:43
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
