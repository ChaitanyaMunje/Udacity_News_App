package com.chinmay.udacitynewsapp;

public class NewsItem {
    private String Title;
    private String SectionName;
    private String WebUrl;
    private String PublishDate;

    public String getTitle() {
        return Title;
    }

    public String getSectionName() {
        return SectionName;
    }

    public String getWebUrl() {
        return WebUrl;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public NewsItem(String title, String sectionName, String webUrl, String publishDate) {
        Title = title;
        SectionName = sectionName;
        WebUrl = webUrl;
        PublishDate = publishDate;
    }
}
