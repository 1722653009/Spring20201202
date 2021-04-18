package com.zlh;

import com.zlh.pojo.Concry;
import com.zlh.pojo.Teacher;
import com.zlh.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DItest {

    @Test
    public void DItest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        Teacher teacher = applicationContext.getBean("teacher2", Teacher.class);
        System.out.println(teacher.getName());

        Concry concry = applicationContext.getBean("concry",Concry.class);
        Concry concry2 = applicationContext.getBean("concry",Concry.class);
        System.out.println(concry==concry2);
    }
}
