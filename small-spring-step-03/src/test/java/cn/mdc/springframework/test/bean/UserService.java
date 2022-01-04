package cn.mdc.springframework.test.bean;

/**
 * TODO
 *
 * @author maodc
 * @date 2022/1/4 下午10:20
 */
public class UserService {

    private String name;

    public UserService() {

    }

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(name);
        return sb.toString();
    }
}
