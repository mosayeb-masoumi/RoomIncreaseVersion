package com.example.roomincreaseversion.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface InfoModelDao {

    //    get all list
    @Query("SELECT * FROM InfoModelRoom")
    List<InfoModelRoom> getAllInfoList();

    @Query("SELECT * FROM InfoModelRoom")
    InfoModelRoom getAllInfoObject();


    @Query("DELETE FROM InfoModelRoom")
    void clearDB();

    //add
    @Insert
    void insertAll(InfoModelRoom infoModelRoom);


    @Update
    void updateInfo(InfoModelRoom infoModelRoom);
}
