package ge.btu.mariami.chakhvadze.currency;

import java.util.ArrayList;

class Currencies {
    public ArrayList<Currency> currencies;

    private Currencies(ArrayList<Currency> currencies) {
        this.currencies = currencies;
    }

    private static class CurrenciesHolder {
        private static final Currencies INSTANCE = new Currencies(new ArrayList<>());
    }

    public static Currencies getCurrencies() {
        return CurrenciesHolder.INSTANCE;
    }
}
