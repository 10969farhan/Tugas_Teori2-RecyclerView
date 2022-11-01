package com.example.mobileteori_tugas2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[], s2[], s3[];
    int images[] =
            {R.drawable.gyj, R.drawable.ivps, R.drawable.fs, R.drawable.thv, R.drawable.wst};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.people);
        s2 = getResources().getStringArray(R.array.deskripsi);
        PeopleAdapter appAdapter = new PeopleAdapter(this, s1, s2, s3, images);
        recyclerView.setAdapter(appAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager((this), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

    }
}