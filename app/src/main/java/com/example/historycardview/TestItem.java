package com.example.historycardview;

public class TestItem {
    private String title;
    private String description;
    private String textViewRide;

    public TestItem(String title, String description,String textViewRide) {
        this.title = title;
        this.description = description;
        this.textViewRide = textViewRide;
    }

    public String getTextViewRide() {
        return textViewRide;
    }

    public void setTextViewRide(String textViewRide) {
        this.textViewRide = textViewRide;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}