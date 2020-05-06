package mariami.chakhvadze.weather.bot;

public class WeatherBotService {
    public static String answer(String question) {
        RESTClient restClient = new RESTClient();

        String result;

        try {
            if (question.equals("all")) {
                result = restClient.get("weather");
            } else {
                result = restClient.get("weather/" + question);
            }
        } catch (Exception e) {
            result = "idk";
            System.out.println(e.getMessage());
        }

        return result;
    }
}
