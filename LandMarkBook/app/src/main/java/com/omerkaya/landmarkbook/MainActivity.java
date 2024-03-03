package com.omerkaya.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.omerkaya.landmarkbook.databinding.ActivityDetailsBinding;
import com.omerkaya.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList; //böyle yaparak Landmark verilerini br Arraylist içince tanımladık.


    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater()); //inflate: bağlama işlemleri yapar.
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>(); //arraylist değer atamasını yapmamız gerekir.



        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

        //verileri burda giriyoruz. Landmark sayfasından çektik verileri.

        Landmark pisa = new Landmark("Pisa", "Italy", R.drawable.pisa);
        Landmark eyfel = new Landmark("Eiffel", "France", R.drawable.eyfel);
        Landmark collesium = new Landmark("Collesium", "Italy", R.drawable.collesium);
        Landmark bridge = new Landmark("London Bridge", "England", R.drawable.bridge);

        //Arraylist'e verilerimizi add yaparak eklememiz de gerekir.
        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eyfel);
        landmarkArrayList.add(collesium);
        landmarkArrayList.add(bridge);

        //Listeleme recycle view kullancağız.








    }
}