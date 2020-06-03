package ge.btu.mariamichakhvadze.service.impl;

import ge.btu.mariamichakhvadze.DTO.movie.*;
import ge.btu.mariamichakhvadze.model.Movie;
import ge.btu.mariamichakhvadze.repository.MovieRepository;
import ge.btu.mariamichakhvadze.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public AddMovieOutput addMovie(AddMovieInput addMovieInput) {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movie.setCountry(addMovieInput.getCountry());

        movieRepository.save(movie);

        AddMovieOutput addMovieOutput = new AddMovieOutput();
        addMovieOutput.setStatusMsg("Added Successfully.");
        return addMovieOutput;
    }

    @Override
    public DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput) {
        Movie movie = movieRepository.getOne(deleteMovieInput.getId());
        movieRepository.delete(movie);

        DeleteMovieOutput deleteMovieOutput = new DeleteMovieOutput();
        deleteMovieOutput.setStatusMsg("Deleted Successfully.");
        return deleteMovieOutput;
    }

    @Override
    public GetMoviesOutput getMovies(GetMoviesInput getMoviesInput) {
        List<MovieDTO> movies = new ArrayList<>();

        for (Movie movie : movieRepository.findAll()) {
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setId(movie.getId());
            movieDTO.setTitle(movie.getTitle());
            movieDTO.setCountry(movie.getCountry());

            movies.add(movieDTO);
        }

        GetMoviesOutput getMoviesOutput = new GetMoviesOutput();
        getMoviesOutput.setMovies(movies);
        return getMoviesOutput;
    }

    @Override
    public GetMovieOutput getMovie(GetMovieInput getMovieInput) {
        Movie movie = movieRepository.getOne(getMovieInput.getId());

        GetMovieOutput getMovieOutput = new GetMovieOutput();
        getMovieOutput.setTitle(movie.getTitle());
        getMovieOutput.setCountry(movie.getCountry());

        return getMovieOutput;
    }
}
