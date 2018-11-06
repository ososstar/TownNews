package com.example.android.townnews;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class NewsAdapter extends ArrayAdapter<News> {
    private static final String DATE_SEPARATOR = "T";

    /**
     * Create a new {@link NewsAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param theNews is the list of {@link News} to be displayed.
     */
    NewsAdapter(Context context, ArrayList<News> theNews) {
        super(context, 0, theNews);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        // setup news title
        String mainTitle = currentNews.getTitle();
        TextView title = convertView.findViewById(R.id.title);
        title.setText(mainTitle);

        // setup news Section
        String section = currentNews.getSection();
        TextView Section = convertView.findViewById(R.id.section);
        Section.setText(section);

        // setup news date and time
        String originalDate = currentNews.getDate();
        String date;
        String time;
        String dTime = "";
        if (originalDate.contains(DATE_SEPARATOR)) {
            String[] parts = originalDate.split(DATE_SEPARATOR);
            date = parts[0];
            time = parts[1];

            String[] divide = time.split(":");
            dTime = divide[0] + ":" + divide[1];
        } else {
            date = originalDate;
            dTime = getContext().getString(R.string.empty);
        }

        TextView dateToDisplay = convertView.findViewById(R.id.date);
        dateToDisplay.setText(date);
        TextView timeToDisplay = convertView.findViewById(R.id.time);
        timeToDisplay.setText(dTime);

        return convertView;
    }
}
