package com.example.roomincreaseversion.room;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

public class UpgradeRoom {


    public static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE InfoModelRoom ADD COLUMN family TEXT"); // add string
        }
    };

    public static final Migration MIGRATION_2_3 = new Migration(2, 3) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {

            database.execSQL("ALTER TABLE 'InfoModelRoom' ADD COLUMN 'grade' INTEGER");  // add int
            database.execSQL("ALTER TABLE InfoModelRoom ADD COLUMN military_service INTEGER DEFAULT 0 NOT NULL");   // add boolean
        }
    };


    public static final Migration MIGRATION_1_3 = new Migration(1, 3) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {

            // get the table from schema
            database.execSQL("CREATE TABLE IF NOT EXISTS `InfoModelRoom2` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `age` INTEGER, `male` INTEGER, `family` TEXT, `grade` INTEGER, `military_service` INTEGER DEFAULT 0 NOT NULL)");
            database.execSQL("INSERT INTO InfoModelRoom2(id,name,age,male) SELECT * FROM InfoModelRoom");
            database.execSQL("DROP TABLE InfoModelRoom");
            database.execSQL("ALTER TABLE InfoModelRoom2 RENAME TO InfoModelRoom");

        }
    };
}
