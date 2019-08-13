package com.stackroute.service;

import com.stackroute.domain.Movie;

public interface MovieService {

    /**
     * AbstractMethod to get a Movie By Id
     */

    Movie getMovieById(int id);

    /**
     * AbstractMethod to save a Movie
     */

    Movie saveMovie(Movie movie);

    /**
     * AbstractMethod to get All the Movies
     */
    Iterable<Movie> getAllMovies();

    /**
     * AbstractMethod to delete a Movie By Id
     */

    Movie deleteMovieById(int id);


    /**
     * AbstractMethod to  Update a Movie By Id
     */

    Movie updateById(Movie movie);
}
