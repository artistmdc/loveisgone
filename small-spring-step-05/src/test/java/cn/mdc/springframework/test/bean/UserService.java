package cn.mdc.springframework.test.bean;

/**
 * TODO
 *
 * @author maodc
 * @date 2022/1/9 上午11:48
 */
public class UserService {

    private String uId;

    private UserDao userDao;

    public void queryUserInfo() {
        userDao.queryUserInfo(uId);
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
