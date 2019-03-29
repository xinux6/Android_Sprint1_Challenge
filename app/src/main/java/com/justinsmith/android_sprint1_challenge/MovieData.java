package com.justinsmith.android_sprint1_challenge;

import java.io.Serializable;

public class MovieData implements Serializable {

    private String title;

    private boolean watched;

    private int index;

    public MovieData(String title, boolean watched, int index) {

        this.title = title;

        this.watched = watched;

        this.index = index;

    }

    public String getTitle() {

        return title;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public boolean isWatched() {

        return watched;

    }

    public void setWatched(boolean watched) {

        this.watched = watched;

    }

    public int getIndex() {

        return index;

    }

}
