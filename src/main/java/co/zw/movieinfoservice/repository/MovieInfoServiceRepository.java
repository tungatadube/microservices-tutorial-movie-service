package co.zw.movieinfoservice.repository;


import co.zw.movieinfoservice.model.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MovieInfoServiceRepository extends CrudRepository<Movie, String> {
    Optional<Movie> findById(String Id);
    Movie save(String Id);

    List<Movie> findAll();
}
