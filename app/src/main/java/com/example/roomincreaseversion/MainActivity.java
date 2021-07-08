package com.example.roomincreaseversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.roomincreaseversion.room.AppDatabase;
import com.example.roomincreaseversion.room.InfoModelRoom;
import com.example.roomincreaseversion.room.RoomInitializing;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    TextView txt;

    AppDatabase dbInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt);


        List<ServerModel> serverList = new ArrayList<>();
        serverList.add(new ServerModel("hassan",34, true));
        serverList.add(new ServerModel("mina",25, false));
        serverList.add(new ServerModel("ali",11, true));


        dbInfo = RoomInitializing.getInstance().infoModelInit(this);


        for (int i = 0; i <serverList.size() ; i++) {
            InfoModelRoom modelRoom = new InfoModelRoom(serverList.get(i).getName() ,serverList.get(i).getAge(),serverList.get(i).getMale());
            dbInfo.infoModelDao().insertAll(modelRoom);
        }


        txt.setText(dbInfo.infoModelDao().getAllInfoList().get(1).getName() + " "+dbInfo.infoModelDao().getAllInfoList().get(1).getAge());
    }
}