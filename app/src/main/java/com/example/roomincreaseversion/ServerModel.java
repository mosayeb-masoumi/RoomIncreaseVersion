package com.example.roomincreaseversion;

import androidx.room.ColumnInfo;

public class ServerModel {

    private String name;
    private Integer age;
    private Boolean male;

    private String family;
    private Integer grade;
    private Boolean military_service;

    public ServerModel(String name, Integer age, Boolean male, String family, Integer grade, Boolean military_service) {
//    public ServerModel(String name, Integer age, Boolean male, String family, Integer grade) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.family = family;
        this.grade = grade;
        this.military_service = military_service;
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

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Boolean getMilitary_service() {
        return military_service;
    }

    public void setMilitary_service(Boolean military_service) {
        this.military_service = military_service;
    }
}
