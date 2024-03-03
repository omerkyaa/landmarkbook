package com.omerkaya.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.omerkaya.landmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_details); normalde bu kısım var. ama bunu silip binding aktif ediyoruz.

        binding = ActivityDetailsBinding.inflate(getLayoutInflater()); //inflate: bağlama işlemleri yapar.
        View view = binding.getRoot();
        setContentView(view);

        //ViewBinding: normalde find....(R.id...) yaparak text ya da imageleri tanımlardık.
        //ama bu araka planda tüm idleri tarayıp açardı. O sebeple bu yeni uygulama çıktı. Daha verimli bir kullanım.
        //build.gradle (module:app) sayfasında etkinleştirdiğim şekli var oraya bak.

        Singleton singleton = Singleton.getInstance();
        Landmark selectedLandmark = singleton.getSentLandmark();

        binding.nameText.setText(selectedLandmark.name);
        binding.countryText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);



    }
}