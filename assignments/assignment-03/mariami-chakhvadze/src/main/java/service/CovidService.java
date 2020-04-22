package service;

import model.Covid;
import model.CovidStatistic;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class CovidService {
    @WebMethod
    public List<Covid> getStatistic() {
        return CovidStatistic.getStatistic();
    }

    @WebMethod
    public Covid getCountryStatistic(String country) {
        for (Covid covid : CovidStatistic.getStatistic()) {
            if (covid.getCountry().equals(country))
                return covid;
        }

        return new Covid(); // კოვიდ ტიპს უნდა აბრუნებდეს ეს მეთოდი და ;დ
    }

    @WebMethod
    public int getTotalConfirmed() {
        int totalConfirmed = 0;

        for (Covid covid : CovidStatistic.getStatistic()) {
            totalConfirmed += covid.getConfirmed();
        }

        return totalConfirmed;
    }

    @WebMethod
    public int getTotalDeath() {
        int totalDeath = 0;

        for (Covid covid : CovidStatistic.getStatistic()) {
            totalDeath += covid.getDeaths();
        }

        return totalDeath;
    }

    @WebMethod
    public int getTotalRecovery() {
        int totalRecovery = 0;

        for (Covid covid : CovidStatistic.getStatistic()) {
            totalRecovery += covid.getRecovered();
        }

        return totalRecovery;
    }
}
