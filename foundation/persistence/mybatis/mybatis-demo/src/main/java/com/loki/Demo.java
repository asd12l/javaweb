package main.java.com.loki;

import main.java.com.loki.dao.UserInfoDao;
import main.java.com.loki.domain.UserInfo;

/**
 * Created by Loki on 2016/11/1.
 */
public class Demo {
    public static void main(String[] args) {
        UserInfoDao userInfoDao = new UserInfoDao();
        UserInfo userInfo = userInfoDao.GetUserInfo(2);
        System.out.println(userInfo);
    }
}
