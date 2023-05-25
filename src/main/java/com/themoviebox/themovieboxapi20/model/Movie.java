package com.themoviebox.themovieboxapi20.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;	
	private String posterPath;
	private double voteAverage;
	@Column(name = "overview", length = 500)
	private String overview;
	@ManyToMany(targetEntity = Genres.class)
	private List<Long> genreIds;
	@Column(length = 10)
	private String releaseDate;
	@Column(precision = 9, scale = 3)
	private double popularity;

	public Movie() {
	}

	public Movie(String title, String posterPath, double voteAverage, String overview,
			String releaseDate, double popularity) {
		this.setTitle(title);
		this.setPosterPath(posterPath);
		this.setVoteAverage(voteAverage);
		this.setOverview(overview);
		this.setReleaseDate(releaseDate);
		this.setPopularity(popularity);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public List<Long> getGenreIds() {
		return genreIds;
	}

	public void setGenreIds(List<Long> genreIds) {
		this.genreIds = genreIds;
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

}