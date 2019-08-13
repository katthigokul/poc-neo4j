package com.stackroute.service;

import com.stackroute.domain.Movies;

public interface MovieService {

    /**
     * AbstractMethod to get a Movie By Id
     */

    Movies getMovieById(int id);

    /**
     * AbstractMethod to save a Movie
     */

    Movies saveMovie(Movies movie);

    /**
     * AbstractMethod to get All the Movies
     */
    Iterable<Movies> getAllMovies();

    /**
     * AbstractMethod to delete a Movie By Id
     */

    Movies deleteMovieById(int id);


    /**
     * AbstractMethod to  Update a Movie By Id
     */

    Movies updateById(Movies movie);
}
