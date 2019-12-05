package com.example.parenting;

public class Activity {

     private int activityImages;
     private String activityNames;

     public Activity(){

     }

    public Activity(int activityImages, String activityNames) {
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
