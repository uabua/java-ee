package ge.btu.edu.client.rest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
        get();
        post();
    }

    public static void get() throws Exception {
        URL url = new URL("http://localhost:8080/Lecture04_war_exploded/api/studentManager/students");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output;
        System.out.println("Output from Server :  \n");
        while ((output = br.readLine()) != null) {
            System.out.println(output);
        }
        conn.disconnect();
    }

    public static void post() throws Exception {

        URL url = new URL("http://localhost:8080/Lecture04_war_exploded/api/studentManager/addStudent");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");

        String input = "{\"id\":20,\"name\":\"Mariami\",\"age\":20}";

        OutputStream os = conn.getOutputStream();
        os.write(input.getBytes());
        os.flush();

        // სტატუსი 204 (no content) ბრუნდება მაშინ თუ ობიექტი წარმატებით დაემატა მაგრამ უკან არ ბრუნდება პასუხი
        // https://stackoverflow.com/questions/12807753/http-get-with-204-no-content-is-that-normal
        if (conn.getResponseCode() != 200 && conn.getResponseCode() != 204) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }

    }
}
