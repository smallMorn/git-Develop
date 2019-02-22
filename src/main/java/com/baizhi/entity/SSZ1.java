package com.baizhi.entity;

public class SSZ1 {
    private int id;

    @Override
    public String toString() {
        return "SSZ1{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SSZ1() {

    }

    public SSZ1(int id) {

        this.id = id;
    }
}
