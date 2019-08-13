package com.stackroute.service;

import com.stackroute.domain.Movie;
import com.stackroute.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class MovieServiceImpl implements MovieService {

    private MoviesRepository moviesRepository;

    @Autowired
    public MovieServiceImpl(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    @Override
    public Movie getMovieById(int id) {
        return moviesRepository.findById(id).get();
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return moviesRepository.save(movie);
    }

    @Override
    public Iterable<Movie> getAllMovies() {
        return moviesRepository.findAll();
    }

    @Override
    public Movie deleteMovieById(int id) {
        Optional<Movie> optionalMovie = moviesRepository.findById(id);
        moviesRepository.deleteById(id);
        return optionalMovie.get();
    }

    @Override
    public Movie updateById(Movie movie) {
        moviesRepository.deleteById(movie.getId());
        return moviesRepository.save(movie);
    }
}