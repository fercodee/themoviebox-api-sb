package com.themoviebox.themovieboxapi20.repositories;

import com.themoviebox.themovieboxapi20.model.Genres;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieGenRepository extends JpaRepository<Genres, Long> {
    
}