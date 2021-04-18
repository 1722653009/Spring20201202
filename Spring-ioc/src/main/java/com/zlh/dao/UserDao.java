package com.zlh.dao;

public class UserDao {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDao(){
        System.out.println("当前spring创建了我");
    }


    public UserDao(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getUser(){
        System.out.println("访问了dao方法");
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
