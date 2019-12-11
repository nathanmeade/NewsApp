package com.example.android.newsapp;

import android.content.Context;
import android.content.AsyncTaskLoader;
import java.util.ArrayList;

public class NewsLoader extends AsyncTaskLoader<ArrayList<News>> {
    String mUrl;
    public NewsLoader(Context context, String url){
        super(context);
        mUrl = url;
    }
    protected void onStartLoading() {
        forceLoad();
    }
    public ArrayList<News> loadInBackground(){
        if (mUrl == null) {
            return null;
        }
        ArrayList<News> news = QueryUtils.extractNews(mUrl);
        return news;
    }
}
