package com.example.cardviewtest;

public class NewsModel {

    String title;
    String description;
    int backgroundImage;

    public NewsModel(String title, String description, int backgroundImage) {
        this.title = title;
        this.description = description;
        this.backgroundImage = backgroundImage;
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

    public int getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(int backgroundImage) {
        this.backgroundImage = backgroundImage;
    }
}
