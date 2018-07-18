package com.example.rump.p2000reader.model;

import java.util.Date;

public class Accident {

    private String title;
    private String description;
    private String link;
    private Date pubDate;
    private Float longitude;
    private Float latitude;

    public Accident(String title, String description, String link, Date pubDate, Float longitude, Float latitude) {
        this.title = title;
        this.description = description;
        this.link = link;
        this.pubDate = pubDate;
        this.longitude = longitude;
        this.latitude = latitude;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }
}
