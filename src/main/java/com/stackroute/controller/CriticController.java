package com.stackroute.controller;

import com.stackroute.domain.Critic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import com.stackroute.domain.Movie;
import com.stackroute.service.RatingService;
import org.springframework.web.bind.annotation.*;

/**
 * RestController annotation is used to create Restful web services using Spring MVC
 */
@RestController
/**
 * RequestMapping annotation maps HTTP requests to handler methods
 */
@RequestMapping(value = "api/v1")
public class CriticController {
    private RatingService ratingService;

    /**
     * Constructor based Dependency injection to inject TrackService into controller
     */

    @Autowired
    private CriticController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    /**
     * GetMapping Annotation for mapping HTTP GET requests onto specific handler methods.
     */
    @GetMapping(value = "/critics")
    public Collection<Critic> getAllCritic() {
        return ratingService.getAllCritic();
    }

    /**
     * GetMapping Annotation for mapping HTTP GET requests onto specific handler methods.
     */
    @GetMapping(value = "/movies")
    public Iterable<Movie> getAllMovie() {
        return ratingService.getAllMovie();
    }

    /**
     * PostMapping Annotation for mapping HTTP GET requests onto specific handler methods.
     */
    @PostMapping(value = "/critic")
    public Critic saveCritic(@RequestBody Critic critic) {
        System.out.println("****" + critic);
        return ratingService.saveCritic(critic);
    }

    /**
     * PutMapping Annotation for mapping HTTP GET requests onto specific handler methods.
     */
    @PutMapping(value = "/critic")
    public Critic updateCritic(@RequestBody Critic critic) {
        return ratingService.updateCriticById(critic);
    }

    /**
     * PostMapping Annotation for mapping HTTP POST requests onto specific handler methods.
     */
    @PostMapping(value = "/movie")
    public Movie saveMovie(@RequestBody Movie movie) {
        return ratingService.saveMovie(movie);
    }

    /**
     * PutMapping Annotation for mapping HTTP GET requests onto specific handler methods.
     */

    @PutMapping(value = "/movie")
    public Movie updateMovie(@RequestBody Movie movie) {
        return ratingService.updateMovieById(movie);
    }

    /**
     * DeleteMapping Annotation for mapping HTTP GET requests onto specific handler methods.
     */
    @DeleteMapping(value = "/critic")
    public Critic deleteCritic(@RequestBody Critic critic) {
        return ratingService.deleteCriticById(critic);
    }

    /**
     * DeleteMapping Annotation for mapping HTTP GET requests onto specific handler methods.
     */
    @DeleteMapping(value = "/movie")
    public Movie deleteMovie(@RequestBody Movie movie) {
        return ratingService.deleteMovieById(movie);
    }

    /**
     * PostMapping Annotation for mapping HTTP POST requests onto specific handler methods.
     */
    @PostMapping(value = "/critic/set")
    public Critic setRelation(@RequestParam long criticId, long movieId, int rating) {
        return ratingService.setRelation(criticId, movieId, rating);
    }

}