package mariami.chakhvadze.weather;

import java.util.ArrayList;
import java.util.List;

public class Forecasts {
    public static List<Weather> getForecasts() {
        List<Weather> forecasts = new ArrayList<>();

        forecasts.add(new Weather("Tbilisi", 20, 15, 70, Weather.DirectionType.EAST, 20));
        forecasts.add(new Weather("Kutaisi", 24, 14, 80, Weather.DirectionType.WEST, 20));
        forecasts.add(new Weather("Batumi", 21, 19, 70, Weather.DirectionType.EAST, 20));

        return forecasts;
    }
}
