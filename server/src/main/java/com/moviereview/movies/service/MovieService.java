package com.moviereview.movies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviereview.movies.dto.Movie;
import com.moviereview.movies.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public List<Movie> allMovies() {
		return movieRepository.findAll();
	}

	public Optional<Movie> getMovie(String id) {
		return movieRepository.findMovieByImdbId(id);
	}
}