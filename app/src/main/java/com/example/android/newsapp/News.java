package com.example.android.newsapp;

public class News {
    private String mTitle;
    private String mSection;
    private String mDate;
    private String mUrl;
    private String mAuthors;
    public News(String title, String section, String date, String url, String authors){
        mTitle = title;
        mSection = section;
        mDate = date;
        mUrl = url;
        mAuthors = authors;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmAuthors() {
        return mAuthors;
    }
}
