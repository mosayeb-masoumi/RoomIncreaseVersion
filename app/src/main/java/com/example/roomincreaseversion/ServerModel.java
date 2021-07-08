package com.example.roomincreaseversion;

import androidx.room.ColumnInfo;

public class ServerModel {

    private String name;
    private int age;
    private Boolean male;

    private String family;

    public ServerModel(String name, int age, Boolean male, String family) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.family = family;
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
}
