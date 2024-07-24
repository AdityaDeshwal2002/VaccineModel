package com.asn8.vaccineapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    RecyclerView recyclerView ;
    VaccineModel[] myVaccineList ;
    VaccineRecyclerViewAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerViewLayout);
        myVaccineList = new VaccineModel[]{
          new VaccineModel("Hepatitis A Vaccine",R.drawable.vaccine1),
                new VaccineModel("Tetanus Vaccine",R.drawable.vaccine4),
                new VaccineModel("Pneumococcal Vaccine",R.drawable.vaccine5),
                new VaccineModel("Rotavirus Vaccine",R.drawable.vaccine6),
                new VaccineModel("Measles Vaccine", R.drawable.vaccine8),
                new VaccineModel("Cholera Vaccine",R.drawable.vaccine7),
                new VaccineModel("COVID-19",R.drawable.vaccine9)
        };
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        myAdapter = new VaccineRecyclerViewAdapter(myVaccineList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(myAdapter);
        myAdapter.setClickListener(MainActivity.this);



    }

    @Override
    public void OnCLick(View v, int position) {
        Toast.makeText(this, "Vaccine Name :"+myVaccineList[position].getItemName(), Toast.LENGTH_SHORT).show();
    }
}
