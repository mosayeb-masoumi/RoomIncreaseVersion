package com.example.roomincreaseversion.room;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class InfoModelRoom {

    @PrimaryKey(autoGenerate = true)
    private int id;


    @ColumnInfo(name = "name")
    private String name = "";

    @ColumnInfo(name = "age")
    private Integer age=0;

    @ColumnInfo(name = "male")
    private Boolean male = false;

    @ColumnInfo(name = "family")
    private String family = "";

    @ColumnInfo(name = "grade")
    private Integer grade = 0;

    @ColumnInfo(name = "military_service")
    private Boolean military_service = false;


    public InfoModelRoom(String name, Integer age, Boolean male, String family, Integer grade, Boolean military_service) {
//    public InfoModelRoom(String name, Integer age, Boolean male, String family, Integer grade) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.family = family;
        this.grade = grade;
        this.military_service = military_service;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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
