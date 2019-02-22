package com.baizhi.entity;

public class GaoX1n {
    private int id;
    private String skill;
    private String experience;


    @Override
    public String toString() {
        return "GaoX1n{" +
                "id=" + id +
                ", skill='" + skill + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void test(){
        System.out.println("我是你爸爸");
    }


}
