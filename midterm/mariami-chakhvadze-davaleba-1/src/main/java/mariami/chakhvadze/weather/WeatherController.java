package mariami.chakhvadze.weather;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
public class WeatherController {

    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getForecasts() {
        return Forecasts.getForecasts();
    }

    @GET
    @Path("/weather/{cityName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getStudent(@PathParam("cityName") String cityName) {
        System.out.println(cityName);

        for (Weather weather : Forecasts.getForecasts()) {
            if (weather.getCityName().equals(cityName)) {
                return weather;
            }
        }

        return new Weather();
    }
}
