package com.baizhi.entity;

public class Programmer {
    /**
     * 深圳写属性
     */
    private Integer id;
    private String name;
    private Double salary;
    /**
     * 明祥写构造
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Programmer)) return false;
        Programmer that = (Programmer) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
    public Programmer (){}
    public Programmer(Integer id,String name,Double salary){
        super();
        this.id=id;
        this.name=name;
        this.salary=salary;


    /**
     * 阳哥重写equals()
     */

    /**
     * 高茂恒写get set  不能使用快捷键
     */


    /**
     * 科蜜酌情补充
     */

}
