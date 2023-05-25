package com.themoviebox.themovieboxapi20.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.themoviebox.themovieboxapi20.controllers.dto.MovieDto;
import com.themoviebox.themovieboxapi20.model.Movie;
import com.themoviebox.themovieboxapi20.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discover")
public class DiscoverController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public List<MovieDto> teste(@Nullable @RequestParam(name = "sort_by") String sortBy,
            @Nullable @RequestParam(name = "with_genre") Long withGenre) {

        List<Movie> response = new ArrayList<>();
        if (!(sortBy == null)) {
            if (sortBy.equals("popularity.desc")) {
                response = movieRepository.findAllByOrderByPopularityDesc();
            } else if (sortBy.equals("vote_average.desc")) {
                response = movieRepository.findAllByOrderByVoteAverageDesc();
            }
        } else if (withGenre != null) {
            response = movieRepository.byGenre(Arrays.asList(withGenre));
        }

        return MovieDto.convert(response);

    }

}