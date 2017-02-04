package com.example.michele.ersupal.model;

/**
 * Created by Michele on 28/01/2017.
 */

public class ListItem {

    private String title;
    private int imageResId;
    private String subTitle;
    private String news;
    private boolean favoutire = false;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getTitle() {
        return title;
    }

    public boolean isFavoutire() {
        return favoutire;
    }

    public void setFavoutire(boolean favoutire) {
        this.favoutire = favoutire;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResId() {

        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }



}
