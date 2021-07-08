package com.example.roomincreaseversion.room;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class InfoModelRoom {

    @PrimaryKey(autoGenerate = true)
    private int id;


    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "age")
    private int age;

    @ColumnInfo(name = "male")
    private Boolean male;

    @ColumnInfo(name = "family")
    private String family;

    @ColumnInfo(name = "grade")
    private int grade;

    @ColumnInfo(name = "military_service")
    private Boolean military_service;


    public InfoModelRoom(String name, int age, Boolean male, String family, int grade, Boolean military_service) {
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Boolean getMilitary_service() {
        return military_service;
    }

    public void setMilitary_service(Boolean military_service) {
        this.military_service = military_service;
    }
}
