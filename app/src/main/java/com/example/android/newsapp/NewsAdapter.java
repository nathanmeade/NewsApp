package com.example.android.newsapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }
        News currentNews = getItem(position);
        TextView titleView = listItemView.findViewById(R.id.title);
        String title = currentNews.getmTitle();
        titleView.setText(title);
        TextView sectionView = listItemView.findViewById(R.id.section);
        String section = currentNews.getmSection();
        sectionView.setText(section);
        TextView dateView = listItemView.findViewById(R.id.date);
        String dateInputString = currentNews.getmDate();
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'");
        try {
            date = sdf.parse(dateInputString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String dateString = formatDate(date);
        dateView.setText(dateString);
        String authors = currentNews.getmAuthors();
        TextView authorsView = listItemView.findViewById(R.id.authors);
        authorsView.setText(authors);
        return listItemView;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
}
