package com.example.android.townnews;

public class News {

    /**
     * The Title of the News
     */
    private String mTitle;

    /**
     * The Image of the News
     */
    private String mSection;

    /**
     * The Date of the News
     */
    private String mDate;

    /**
     * The url of the News
     */
    private String mUrl;

    /**
     * Create a new News Object
     */
    public News(String Title, String Section, String Date, String url) {
        mTitle = Title;
        mSection = Section;
        mDate = Date;
        mUrl = url;
    }

    /**
     * get the Title of the News
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * get the Image of the News
     */
    public String getSection() {
        return mSection;
    }

    /**
     * get the Date of the News
     */
    public String getDate() {
        return mDate;
    }

    /**
     * get the url of the News
     */
    public String getUrl() {
        return mUrl;
    }

}
