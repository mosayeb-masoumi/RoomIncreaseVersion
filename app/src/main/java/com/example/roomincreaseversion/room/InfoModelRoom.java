package com.example.roomincreaseversion.room;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class InfoModelRoom {

    @PrimaryKey(autoGenerate = true)
    private int id = 0;


    @ColumnInfo(name = "name")
    private String name = "";

    @ColumnInfo(name = "age")
    private Integer age =0;

    @ColumnInfo(name = "male")
    private Boolean male = false;

    @ColumnInfo(name = "family")
    private String family = "";


    public InfoModelRoom(String name, Integer age, Boolean male, String family) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.family = family;
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
}
