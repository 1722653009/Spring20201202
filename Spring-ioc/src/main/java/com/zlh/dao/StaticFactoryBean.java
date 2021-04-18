package com.zlh.dao;

public class StaticFactoryBean {

    public static UserDao createUserDao(){
        return new UserDao();
    }
}
