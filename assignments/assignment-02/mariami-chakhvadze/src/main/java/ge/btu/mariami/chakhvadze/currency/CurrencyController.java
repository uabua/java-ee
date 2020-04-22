package ge.btu.mariami.chakhvadze.currency;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/currency")
public class CurrencyController {

    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Currency> getCurrencies() {
        ArrayList<Currency> currencies = Currencies.getCurrencies().currencies;

        currencies.add(new Currency("USD", 3.16, 3.2));
        currencies.add(new Currency("EUR", 3.425, 3.475));
        currencies.add(new Currency("GBP", 3.84, 3.94));
        currencies.add(new Currency("RUB", 4.12, 4.3));
        currencies.add(new Currency("TRY", 0.4, 0.47));
        currencies.add(new Currency("AZN", 1.6, 1.84));

        return currencies;
    }

    @POST
    @Path("/buy")
    @Consumes(MediaType.APPLICATION_JSON)
    public double toCurrency(Gel gel) {
        for (Currency currency: Currencies.getCurrencies().currencies) {
            if (currency.getTitle().equals(gel.getTo())) {
                return gel.getAmount() / currency.getSell();
            }
        }

        return 0;
    }

    @POST
    @Path("/sell")
    @Consumes(MediaType.APPLICATION_JSON)
    public double fromCurrency(Gel gel) {
        for (Currency currency: Currencies.getCurrencies().currencies) {
            if (currency.getTitle().equals(gel.getTo())) {
                return gel.getAmount() * currency.getBuy();
            }
        }

        return 0;
    }
}
