package co.zw.movieinfoservice.service;

import co.zw.movieinfoservice.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieInfoService {
    Optional<Movie> findById(String movieId);
     Movie save(String Id);
    List<Movie> findAll();
}
