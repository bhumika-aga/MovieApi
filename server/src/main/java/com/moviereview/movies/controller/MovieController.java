package com.moviereview.movies.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviereview.movies.dto.Movie;
import com.moviereview.movies.service.MovieService;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin("${env.ALLOWED_ORIGINS}")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping
	public ResponseEntity<?> getAllMovies() {
		return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
	}

	@GetMapping("/{imdbId}")
	public ResponseEntity<Optional<Movie>> getMovie(@PathVariable String imdbId) {
		return new ResponseEntity<>(movieService.getMovie(imdbId), HttpStatus.OK);
	}
}