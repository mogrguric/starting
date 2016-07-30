package com.inowave.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.inowave.data.models.Movie;
 
public interface IMovieRepository extends CrudRepository<Movie, Long> {
 
    List<Movie> findByYearLessThan(int year);
 
}
