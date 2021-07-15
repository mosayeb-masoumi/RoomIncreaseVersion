package com.example.roomincreaseversion.room;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

public class UpgradeRoom {


//    public static final Migration MIGRATION_3_5 = new Migration(3,5) {
//        @Override
//        public void migrate(SupportSQLiteDatabase database) {
//            // Since we didn't alter the table, there's nothing else to do here.
//            database.execSQL("ALTER TABLE HadisContentModelDb ADD COLUMN read INTEGER DEFAULT 0 NOT NULL");
//
//
////            database.execSQL("ALTER TABLE NamazModel ADD COLUMN namazIsActive INTEGER DEFAULT 0 NOT NULL");
//
//            /***********************************************************************************************/
//            database.execSQL("CREATE TABLE NamazModel_new (" +
//                    "id INTEGER PRIMARY KEY NOT NULL," +
//                    "morning INTEGER NOT NULL DEFAULT 0," +
//                    "zohr INTEGER NOT NULL DEFAULT 0," +
//                    "asr INTEGER NOT NULL DEFAULT 0," +
//                    "maghreb INTEGER NOT NULL DEFAULT 0," +
//                    "esha INTEGER NOT NULL DEFAULT 0," +
//                    "ayat INTEGER NOT NULL DEFAULT 0," +
//                    "rooze INTEGER NOT NULL DEFAULT 0," +
//                    "setting_type TEXT NOT NULL DEFAULT ''," +
//                    "hour INTEGER NOT NULL DEFAULT 0," +
//                    "minute INTEGER NOT NULL DEFAULT 0," +
//                    "notif_id INTEGER NOT NULL DEFAULT 0," +
//                    "day_of_week INTEGER NOT NULL DEFAULT 0," +
//                    "civil_year INTEGER NOT NULL DEFAULT 0," +
//                    "civil_month INTEGER NOT NULL DEFAULT 0," +
//                    "civil_day INTEGER NOT NULL DEFAULT 0," +
//                    "namazEventId TEXT NOT NULL DEFAULT ''," +
//                    "namazIsActive INTEGER NOT NULL DEFAULT 0)");
//
//
//
//
//            database.execSQL("INSERT INTO NamazModel_new (morning, zohr, asr, maghreb, esha, ayat, rooze, setting_type, hour, minute, notif_id, namazEventId) " +
//                    "SELECT morning, zohr, asr, maghreb, esha, ayat, rooze, setting_type, hour, minute, notif_id, namazEventId FROM NamazModel");
//
//
//            database.execSQL("DROP TABLE NamazModel");
//            database.execSQL("ALTER TABLE NamazModel_new RENAME TO NamazModel");
//
//

    /***********************************************************************************************/


//////            // Create the new table
//            database.execSQL(
//                    "CREATE TABLE NamazModel_new (id INTEGER, morning INTEGER, zohr INTEGER, asr INTEGER, maghreb INTEGER, esha INTEGER, ayat INTEGER, rooze INTEGER, setting_type TEXT, hour INTEGER, minute INTEGER, notif_id INTEGER, day_of_week INTEGER, civil_year INTEGER, civil_month INTEGER, civil_day INTEGER, namazEventId TEXT, namazIsActive INTEGER, PRIMARY KEY(id))");

//            database.execSQL("CREATE TABLE IF NOT EXISTS NamazModel_new " +
//                    "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
//                    "morning INTEGER NOT NULL, zohr INTEGER NOT NULL, asr INTEGER NOT NULL, maghreb INTEGER NOT NULL, esha INTEGER NOT NULL, ayat INTEGER NOT NULL, rooze INTEGER NOT NULL, setting_type TEXT NOT NULL, hour INTEGER NOT NULL, minute INTEGER NOT NULL, notif_id INTEGER NOT NULL, day_of_week INTEGER NOT NULL, civil_year INTEGER NOT NULL, civil_month INTEGER NOT NULL, " +
//                    "civil_day INTEGER NOT NULL, namazEventId TEXT NOT NULL, namazIsActive INTEGER NOT NULL)");
//


////            // Copy the data
//            database.execSQL(
//                    "INSERT INTO NamazModel_new (morning, zohr, asr, maghreb, esha, ayat, rooze, setting_type, hour, minute, notif_id, namazEventId) SELECT morning, zohr, asr, maghreb, esha, ayat, rooze, setting_type, hour, minute, notif_id, namazEventId FROM NamazModel");
////                    "INSERT INTO NamazModel_new (morning, zohr, asr, maghreb, esha, ayat, rooze, setting_type, hour, minute, notif_id, day_of_week, civil_year, civil_month, civil_day, namazEventId , namazIsActive) SELECT morning, zohr, asr, maghreb, esha, ayat, rooze, setting_type, hour, minute, notif_id, day_of_week, civil_year, civil_month, civil_day, namazEventId, namazIsActive FROM NamazModel");
//
//
//            // Remove the old table
//            database.execSQL("DROP TABLE NamazModel");
//// Change the table name to the correct one
//            database.execSQL("ALTER TABLE NamazModel_new RENAME TO NamazModel");
//
//
//
//        }
//    };



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
            // Since we didn't alter the table, there's nothing else to do here.
//            database.execSQL("ALTER TABLE InfoModelRoom ADD COLUMN family TEXT");   // add string   from V1 to V2
//            database.execSQL("ALTER TABLE 'InfoModelRoom' ADD COLUMN 'grade' INTEGER");  // add int   from V2 to V3
//            database.execSQL("ALTER TABLE InfoModelRoom ADD COLUMN military_service INTEGER DEFAULT 0 NOT NULL"); // add boolean from V2 to V3


            database.execSQL("CREATE TABLE IF NOT EXISTS `InfoModelRoom2` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `age` INTEGER, `male` INTEGER, `family` TEXT, `grade` INTEGER, `military_service` INTEGER NOT NULL)");
            database.execSQL("INSERT INTO InfoModelRoom2(name,age,male) SELECT * FROM InfoModelRoom");
            database.execSQL("DROP TABLE InfoModelRoom");
            database.execSQL("ALTER TABLE InfoModelRoom2 RENAME TO InfoModelRoom");
            database.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_InfoModelRoom_shortName` ON `InfoModelRoom` (`shortName`)");


        }
    };
}
