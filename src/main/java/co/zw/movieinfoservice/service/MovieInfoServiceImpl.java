package co.zw.movieinfoservice.service;

import co.zw.movieinfoservice.model.Movie;
import co.zw.movieinfoservice.repository.MovieInfoServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MovieInfoServiceImpl implements MovieInfoService {

    private MovieInfoServiceRepository movieRepository;

    @Autowired
    public MovieInfoServiceImpl(MovieInfoServiceRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Optional<Movie> findById(String movieId) {
        return movieRepository.findById(movieId);
    }

    @Override
    public Movie save(String id) {
        return movieRepository.save(id);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }
}
