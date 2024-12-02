package Year22WP.Aufgabe7;

import java.util.regex.Pattern;

/**
 * Soll in Aufgabe 6 gemacht werden
 */
public class Geschenk {
    private static final Pattern pattern = Pattern.compile("[A-Z][a-z]{0,24}");
    public final String empfaenger;
    protected final long preis;

    protected Geschenk(String empfaenger, long preis) {
        if (empfaenger == null || !pattern.matcher(empfaenger).matches()) {
            throw new IllegalArgumentException("Empfängername nicht erlaubt");
        }
        if (preis <= 0)
            throw new IllegalArgumentException("Preis nicht erlaubt");

        this.empfaenger = empfaenger;
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Geschenk für " + empfaenger + " " + preis;
    }
}
