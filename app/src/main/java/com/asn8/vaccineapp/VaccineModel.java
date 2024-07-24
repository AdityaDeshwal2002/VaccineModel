package com.asn8.vaccineapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class VaccineModel{
    private String itemName;
    private int image;

    public VaccineModel(String itemName, int image) {
        this.image = image;
        this.itemName = itemName;
    }

    public void setImage(int image) {
        image = this.image;
    }

    public void setItemName(String itemName) {
        itemName = this.itemName;
    }

    public int getImage() {
        return image;
    }

    public String getItemName() {
        return itemName;
    }

}
