package com.baizhi.entity;

public class Lkl {
    private int age;
    private String name;
    private char sex;
    private long jj;

    public Lkl() {
    }

    public Lkl(int age, String name, char sex, long jj) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.jj = jj;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public long getJj() {
        return jj;
    }

    public void setJj(long jj) {
        this.jj = jj;
    }

    @Override
    public String toString() {
        return "Lkl{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", jj=" + jj +
                '}';
    }
}
