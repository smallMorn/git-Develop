package com.baizhi.entity;

public class SSZ {
    private int id;
    private String name;
    private int sex;

    @Override
    public String toString() {
        return "SSZ{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public SSZ() {

    }

    public SSZ(int id, String name, int sex) {

        this.id = id;
        this.name = name;
        this.sex = sex;
    }
}
