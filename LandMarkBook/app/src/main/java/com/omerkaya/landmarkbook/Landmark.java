package com.omerkaya.landmarkbook;

public class Landmark {

    String name;
    String country;
    int image; //görseli integer olarak kaydederim çünkü resimleri draxable'a attığımızda her görsele bir integer sayı atar.bu yüzden artık int olur.

    //constructor yapısı kullanacağız. Bu sayede artık anasyfada Landmark diyerek burdaki verileri çağırırım.
    public Landmark(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;

    }







}

