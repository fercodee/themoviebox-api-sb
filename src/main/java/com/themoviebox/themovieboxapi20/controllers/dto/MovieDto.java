package com.themoviebox.themovieboxapi20.controllers.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.themoviebox.themovieboxapi20.model.Movie;

public class MovieDto {
    
    private String title;
    private String posterPath;
    private Double voteAverage;
    private String overview;
    private String releaseDate;
    private Double popularity;

    public MovieDto(Movie movie) {
        this.title = movie.getTitle();
        this.posterPath = movie.getPosterPath();
        this.voteAverage = movie.getVoteAverage();
        this.overview = movie.getOverview();
        this.releaseDate = movie.getReleaseDate();
        this.popularity = movie.getPopularity();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public static List<MovieDto> convert(List<Movie> movies) {

        return movies.stream().map(movie -> new MovieDto(movie)).collect(Collectors.toList());

    }
    

}