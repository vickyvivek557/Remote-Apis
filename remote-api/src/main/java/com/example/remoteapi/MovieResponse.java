package com.example.remoteapi;

public class MovieResponse {
    private String original_title;
    private String imdb_id;
    private String budget;
    private String adult;
    private String release_date;
    private int runtime;
    private int revenue;

    public MovieResponse() {
    }

    public MovieResponse(String original_title, String imdb_id, String budget, String adult, String release_date, int runtime, int revenue) {
        this.original_title = original_title;
        this.imdb_id = imdb_id;
        this.budget = budget;
        this.adult = adult;
        this.release_date = release_date;
        this.runtime = runtime;
        this.revenue = revenue;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getAdult() {
        return adult;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }
}
