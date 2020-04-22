package model;

import java.util.ArrayList;
import java.util.List;

public class CovidStatistic {
    public static List<Covid> getStatistic() {
        List<Covid> covidStatistics = new ArrayList<Covid>();

        covidStatistics.add(new Covid("US", 760245, 40702, 71003));
        covidStatistics.add(new Covid("Spain", 200210, 166256, 635095));
        covidStatistics.add(new Covid("Italy", 170972, 23660, 51003));
        covidStatistics.add(new Covid("Georgia", 368, 4, 72));

        return covidStatistics;
    }
}
