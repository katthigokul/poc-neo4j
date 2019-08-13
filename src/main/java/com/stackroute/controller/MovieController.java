package com.stackroute.controller;

import com.stackroute.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController annotation is used to create Restful web services using Spring MVC
 */
@RestController

/**
 * RequestMapping annotation maps HTTP requests to handler methods
 */

@RequestMapping(value = "api/v1/")


public class MovieController {
    private MovieService movieService;

    @Autowired
    private MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
}
