package com.stackroute.service;

import com.stackroute.domain.Movies;
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
    public Movies getMovieById(int id) {
        return moviesRepository.findById(id).get();
    }

    @Override
    public Movies saveMovie(Movies movies) {
        return moviesRepository.save(movies);
    }

    @Override
    public Iterable<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }

    @Override
    public Movies deleteMovieById(int id) {
        Optional<Movies> optionalMovie = moviesRepository.findById(id);
        moviesRepository.deleteById(id);
        return optionalMovie.get();
    }

    @Override
    public Movies updateById(Movies movies) {
        moviesRepository.deleteById(movies.getId());
        return moviesRepository.save(movies);
    }
}