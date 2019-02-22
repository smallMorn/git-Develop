package com.baizhi.entity;

import java.util.Objects;

public class Programmer {
    /**
     * 深圳写属性
     */
    private int old;
    private int length;
    private String face;
    /**
     * 明祥写构造
     */
    public Programmer() {

    }

    public Programmer(int old, int length, String face) {
        super();
        this.old = old;
        this.length = length;
        this.face = face;
    }

    /**
     * 阳哥重写equals()
     *
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Programmer)) {
            return false;
        }
        Programmer that = (Programmer) o;
        return old == that.old &&
                length == that.length &&
                Objects.equals(face, that.face);
    }

    @Override
    public int hashCode() {
        return Objects.hash(old, length, face);
    }

    /**
     * 高茂恒写get set  不能使用快捷键
     */
    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }
/**
     * 科蜜酌情补充
     */
public static void main(String[] args) {
    System.out.println("我写尼玛卖批");
}

}
