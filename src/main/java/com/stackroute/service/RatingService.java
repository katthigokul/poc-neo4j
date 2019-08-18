package com.stackroute.service;

import com.stackroute.domain.Critic;
import com.stackroute.domain.Movie;
import com.stackroute.repository.CriticRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public interface RatingService {

    /*getCriticById Method*/
    Critic getCriticById(Critic critic);

    /*saveCritic Method*/
    Critic saveCritic(Critic movie);

    /*getAllCritic Method*/
    Collection<Critic> getAllCritic();

    /*DeleteCriticById Method*/
    Critic deleteCriticById(Critic critic);

    /*Update CriticById Method*/
    Critic updateCriticById(Critic movie);

    /*GetMovieById Method*/
    Movie getMovieById(Movie movie);

    /*SaveMovie Method*/
    Movie saveMovie(Movie movie);

    /*GetAllMovie Method*/
    Iterable<Movie> getAllMovie();

    /*DeleteMovieById Method*/
    Movie deleteMovieById(Movie movie);

    /*UpdateMovieById Method*/
    Movie updateMovieById(Movie movie);

    Critic setRelation(long criticId, long movieId, int rating);

}
