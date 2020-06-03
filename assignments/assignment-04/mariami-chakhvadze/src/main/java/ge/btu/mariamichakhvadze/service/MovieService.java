package ge.btu.mariamichakhvadze.service;

import ge.btu.mariamichakhvadze.DTO.movie.*;

public interface MovieService {
    AddMovieOutput addMovie(AddMovieInput addMovieInput);

    DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput);

    GetMoviesOutput getMovies(GetMoviesInput getMoviesInput);

    GetMovieOutput getMovie(GetMovieInput getMovieInput);
}
