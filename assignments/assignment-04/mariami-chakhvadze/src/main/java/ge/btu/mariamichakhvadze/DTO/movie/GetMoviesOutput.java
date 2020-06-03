package ge.btu.mariamichakhvadze.DTO.movie;

import lombok.Data;

import java.util.List;

@Data
public class GetMoviesOutput {
    private List<MovieDTO> movies;

}
