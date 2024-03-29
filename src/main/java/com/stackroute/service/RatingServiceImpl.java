package com.stackroute.service;

import com.stackroute.domain.Critic;
import com.stackroute.domain.Movie;
import com.stackroute.repository.CriticRepository;
import com.stackroute.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

/*
    @Service indicates annotated class is a service which hold business logic in the Service layer
 */
@Service
public class RatingServiceImpl implements RatingService {
    private CriticRepository criticRepository;
    private MovieRepository movieRepository;

    @Autowired
    public RatingServiceImpl(CriticRepository criticRepository, MovieRepository movieRepository) {
        this.criticRepository = criticRepository;
        this.movieRepository = movieRepository;
    }

    @Override
    public Critic getCriticById(Critic critic) {

        return criticRepository.findById((int) critic.getId()).get();
    }

    @Override
    public Critic saveCritic(Critic critic) {
        System.out.println(critic);
        return criticRepository.save(critic);
    }

    @Override
    public Collection<Critic> getAllCritic() {
        return criticRepository.getAllCritic();
    }

    @Override
    public Critic deleteCriticById(Critic critic) {
        Optional<Critic> optionalMovie = criticRepository.findById((int) critic.getId());
        criticRepository.deleteById((int) critic.getId());
        return optionalMovie.get();
    }

    @Override
    public Critic updateCriticById(Critic critic) {
        criticRepository.deleteById((int) critic.getId());
        return criticRepository.save(critic);
    }

    @Override
    public Movie getMovieById(Movie movie) {

        return movieRepository.findById((int) movie.getId()).get();
    }

    @Override
    public Movie saveMovie(Movie movie) {

        return movieRepository.save(movie);
    }

    @Override
    public Iterable<Movie> getAllMovie() {

        return movieRepository.findAll();
    }

    @Override
    public Movie deleteMovieById(Movie movie) {
        Optional<Movie> optionalMovie = movieRepository.findById((int) movie.getId());
        movieRepository.deleteById((int) movie.getId());
        return optionalMovie.get();
    }

    @Override
    public Movie updateMovieById(Movie movie) {
        movieRepository.deleteById((int) movie.getId());
        return movieRepository.save(movie);
    }

    @Override
    public Critic setRelation(long criticId, long movieId, int rating) {
        return criticRepository.setRelation(rating);
    }
}