package com.themoviebox.themovieboxapi20.controllers;

import java.util.List;

import com.themoviebox.themovieboxapi20.controllers.dto.MovieDto;
import com.themoviebox.themovieboxapi20.model.Movie;
import com.themoviebox.themovieboxapi20.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/search")
public class SearchController {
    
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public List<MovieDto> queryName(@Nullable @RequestParam(name = "query") String title) {

        String inputSearch = "%"+ title +"%";

        List<Movie> response = movieRepository.findByTitleLike(inputSearch);

        return MovieDto.convert(response);

    }

    
}