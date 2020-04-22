package ge.btu.mariami.chakhvadze.currency;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Gel {
    private String to;
    private int amount;

    public Gel() {
    }

    public Gel(String to, int amount) {
        this.to = to;
        this.amount = amount;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Gel{" +
                "to='" + to + '\'' +
                ", amount=" + amount +
                '}';
    }
}
