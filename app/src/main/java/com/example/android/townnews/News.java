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
     * The URL of the News
     */
    private String mURL;

    /**
     * The Author of the News
     */
    private String mAuthor;


    /**
     * Create a new News Object
     */
    public News(String Title, String Section, String Date, String URL, String Author) {
        mTitle = Title;
        mSection = Section;
        mDate = Date;
        mURL = URL;
        mAuthor = Author;
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
        return mURL;
    }

    /**
     * get the Author of the News
     */
    public String getAuthor() {
        return mAuthor;
    }

}
