package com.stackroute.service;

import com.stackroute.domain.Movies;

public interface MovieService {
    Movies getMovieById(int id);
    Movies saveMovie(Movies movie);
    Iterable<Movies> getAllMovies();
    Movies deleteMovieById(int id);
    Movies updateById(Movies movie);
}
