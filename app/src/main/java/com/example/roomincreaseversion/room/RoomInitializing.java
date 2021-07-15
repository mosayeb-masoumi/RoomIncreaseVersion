package com.example.roomincreaseversion.room;

import android.content.Context;

import androidx.room.Room;

public class RoomInitializing {

    AppDatabase dbInfo;
    private static RoomInitializing instance = null;


    private RoomInitializing() {}

    public static synchronized RoomInitializing getInstance() {
        if(instance == null)
            instance = new RoomInitializing();
        return instance;
    }


    public AppDatabase infoModelInit(Context context) {
        dbInfo = Room.databaseBuilder(context, AppDatabase.class, "infomodel")
                .allowMainThreadQueries()
//                .addMigrations(UpgradeRoom.MIGRATION_1_2,UpgradeRoom.MIGRATION_2_3 , UpgradeRoom.MIGRATION_1_3)
                .build();

        return dbInfo;
    }
}
