package com.demo;

import com.demo.redis.util.JedisUtil;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(JUnit4.class)
@SpringBootTest
public class DemoApplicationTests {

//    @Autowired
//    RedisConnectionFactory factory;

    @Test
    public void contextLoads() {

                //得到一个连接
//                RedisConnection conn = factory.getConnection();
//                conn.set("hello".getBytes(), "world".getBytes());
//                System.out.println(new String(conn.get("hello".getBytes())));
        JedisUtil.getJedis().set( "name".getBytes(),"tlx".getBytes() );
        System.out.println( JedisUtil.getJedis().get( "name" ));

    }

}
