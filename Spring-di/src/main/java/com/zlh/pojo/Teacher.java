package com.zlh.pojo;

import java.util.*;

public class Teacher {

    private String name;
    private Concry country; //持有关系
    private String[] avis;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;
    private String boyfriend;
    private Properties properties;// 使用properties写入 jdbc连接属性 hashmap 键值对

    public Teacher() {
    }

    public Teacher(String name, Concry country, String[] avis, List<String> list, Map<String, String> map, Set<String> set, String boyfriend, Properties properties) {
        this.name = name;
        this.country = country;
        this.avis = avis;
        this.list = list;
        this.map = map;
        this.set = set;
        this.boyfriend = boyfriend;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Concry getCountry() {
        return country;
    }

    public void setCountry(Concry country) {
        this.country = country;
    }

    public String[] getAvis() {
        return avis;
    }

    public void setAvis(String[] avis) {
        this.avis = avis;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String getBoyfriend() {
        return boyfriend;
    }

    public void setBoyfriend(String boyfriend) {
        this.boyfriend = boyfriend;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", country=" + country.toString() +
                ", avis=" + Arrays.toString(avis) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", boyfriend='" + boyfriend + '\'' +
                ", properties=" + properties +
                '}';
    }
}
