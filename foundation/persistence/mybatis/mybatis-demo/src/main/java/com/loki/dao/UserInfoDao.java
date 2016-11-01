package main.java.com.loki.dao;

import main.java.com.loki.ConnectionFactory;
import main.java.com.loki.domain.UserInfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by Loki on 2016/11/1.
 */
public class UserInfoDao {
    public UserInfo GetUserInfo(Integer id)
    {
        try {
            SqlSessionFactory sessionFactory = ConnectionFactory.getSqlSessionFactory();
            SqlSession session =  sessionFactory.openSession();
            UserInfo userInfo =    session.selectOne("selectUserInfo",2);
            return  userInfo;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
