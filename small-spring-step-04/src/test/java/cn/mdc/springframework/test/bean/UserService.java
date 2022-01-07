package cn.mdc.springframework.test.bean;

/**
 * TODO
 *
 * @author maodc
 * @date 2022/1/7 下午8:57
 */
public class UserService {

    private String uId;

    private UserDao userDao;

    public void queryInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(uId));
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
