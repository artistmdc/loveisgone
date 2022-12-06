package cn.mdc.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author maodc
 * @date 2022/1/9 上午11:48
 */
public class UserDao {

    private final static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "小傅哥");
        hashMap.put("10002", "八杯水");
        hashMap.put("10003", "阿毛");
    }

    public void queryUserInfo(String uId) {
        System.out.println(hashMap.get(uId));
    }

}
