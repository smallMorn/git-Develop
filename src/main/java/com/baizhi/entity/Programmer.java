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
        if (this == o) return true;
        if (!(o instanceof Programmer)) return false;
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


    /**
     * 科蜜酌情补充
     */

}
