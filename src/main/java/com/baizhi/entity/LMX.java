package com.baizhi.entity;

public class LMX {
    private String name;
    private int age;
    private String DianHua;

    public LMX() {
    }

    public LMX(String name, int age, String dianHua) {
        this.name = name;
        this.age = age;
        this.DianHua = dianHua;
    }

    @Override
    public String toString() {
        return "LMX{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DianHua='" + DianHua + '\'' +
                '}';
    }

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

    public String getDianHua() {
        return DianHua;
    }

    public void setDianHua(String dianHua) {
        DianHua = dianHua;
    }
}
