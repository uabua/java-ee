package mariami.chakhvadze.weather.bot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RESTClient {
    public String get(String path) throws Exception {
        URL url = new URL(String.format("http://localhost:8080/mariami_chakhvadze_davaleba_1_war_exploded/api/%s", path));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }


        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output;
        String reply = "";

        while ((output = br.readLine()) != null) {
            reply += output;
        }

        conn.disconnect();

        return reply;
    }
}
