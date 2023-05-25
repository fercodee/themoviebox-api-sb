package com.themoviebox.themovieboxapi20.repositories;

import java.util.List;

// import com.themoviebox.themovieboxapi20.model.Genres;
import com.themoviebox.themovieboxapi20.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

	List<Movie> findAllByOrderByPopularityDesc();

	List<Movie> findAllByOrderByVoteAverageDesc();

	@Query("SELECT m FROM Movie m INNER JOIN m.genreIds g WHERE g.id IN (:withGenre)")
	List<Movie> byGenre(@Param("withGenre") List<Long> withGenre);

	List<Movie> findByTitleLike(String title);
    
}