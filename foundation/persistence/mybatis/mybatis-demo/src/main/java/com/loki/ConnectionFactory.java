package main.java.com.loki;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by Loki on 2016/11/1.
 */
public class ConnectionFactory {
    private  static SqlSessionFactory sqlMapper;

    private  static Reader reader;

    static
    {
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
/*
String password = decryptPassword(encryptedPassword);
Properties properties = new Properties();
properties.setProperty("password", password);
 */
            sqlMapper = new SqlSessionFactoryBuilder().build(reader /*,properties*/);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public  static  SqlSessionFactory getSqlSessionFactory()
    {
        return  sqlMapper;
    }

}
