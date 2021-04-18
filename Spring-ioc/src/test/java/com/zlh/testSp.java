package com.zlh;

import com.zlh.dao.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class testSp {

    @Test
    public void showUser(){
        // 调用dao方法,new对象
        // UserDao userDao = new UserDao();
        // userDao.getUser();

        // 使用springioc管理bean创建对象
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-config.xml");
//        UserDao userDao1 = (UserDao) applicationContext.getBean("userDao");
//        UserDao userDao2 = (UserDao) applicationContext.getBean("userDao");
//        System.out.println(userDao1.toString());

//        Resource resource = new ClassPathResource("Spring-config.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        UserDao userDao = beanFactory.getBean("userDao",UserDao.class);
//        userDao.getUser();

//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IDEA\\Spring20201202\\Spring-ioc\\src\\main\\resources\\Spring-config.xml");
//        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
//        userDao.getUser();

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-config.xml");
//        UserDao userDao2 = applicationContext.getBean("userDao2",UserDao.class);
//        userDao2.getUser();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-config.xml");
        UserDao ud = applicationContext.getBean("ud",UserDao.class);
        ud.getUser();
    }
}
