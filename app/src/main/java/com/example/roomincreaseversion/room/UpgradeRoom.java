package com.example.roomincreaseversion.room;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

public class UpgradeRoom {


        public static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            // Since we didn't alter the table, there's nothing else to do here.
            database.execSQL("ALTER TABLE InfoModelRoom ADD COLUMN family TEXT");
        }
    };


}
