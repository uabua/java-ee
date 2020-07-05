package mariami.chakhvadze.model;

import java.util.ArrayList;
import java.util.Date;

public class Currencies {
    public static ArrayList<Currency> get() {
        ArrayList<Currency> currencies = new ArrayList<>();

        currencies.add(new Currency("EEK", 1.0754, "10 ესტონური კრონი", new Date()));
        currencies.add(new Currency("EUR", 3.0045, "1 ევრო", new Date()));
        currencies.add(new Currency("USD", 2.8674, "1 დოლარი", new Date()));

        return currencies;
    }
}

