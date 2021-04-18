package com.zlh.dao;

public class FactoryBean {

    public UserDao createUserDao(){
        return new UserDao();
    }
}
