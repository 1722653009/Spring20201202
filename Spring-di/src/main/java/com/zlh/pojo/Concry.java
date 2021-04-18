package com.zlh.pojo;

public class Concry {

    private String name;

    public Concry() {
    }

    public Concry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Concry{" +
                "name='" + name + '\'' +
                '}';
    }
}
