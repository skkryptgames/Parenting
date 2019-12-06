package com.example.parenting.models;

public class HomeScreenModel {

     private int activityImages;
     private String activityNames;

     public HomeScreenModel(){

     }

    public HomeScreenModel(int activityImages, String activityNames) {
        this.activityImages = activityImages;
        this.activityNames = activityNames;
    }

    public int getActivityImages() {
        return activityImages;
    }

    public String getActivityNames() {
        return activityNames;
    }
}
