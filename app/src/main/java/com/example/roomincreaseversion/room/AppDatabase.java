package com.example.roomincreaseversion.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {InfoModelRoom.class}, version = 1, exportSchema = true)


public  abstract class AppDatabase extends RoomDatabase {
    public abstract InfoModelDao infoModelDao();
}
