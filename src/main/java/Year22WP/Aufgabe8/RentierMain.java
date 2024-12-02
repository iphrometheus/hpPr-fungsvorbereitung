package Year22WP.Aufgabe8;

public class RentierMain {
    public static void main(String[] args) {
        Rentier rudolph = Rentier.withName("Rudolph");
        Rentier max = Rentier.withName("Max");
        Rentier rudi = Rentier.withName("Rudi");
        Rentier maike = Rentier.withName("Maike");
        Rentier nikola = Rentier.withName("Nikola");

        EinsatzPlanung einsaetze = new EinsatzPlanung();
        System.out.println(einsaetze.plusVerwendung(rudolph, 300));
        einsaetze.plusVerwendung(maike, 500);
        einsaetze.plusVerwendung(nikola, 300000);
        einsaetze.plusVerwendung(max, 6000);
        einsaetze.plusVerwendung(rudi, 3000);
        System.out.println(einsaetze.plusVerwendung(rudolph, 2147483641));
        System.out.println(einsaetze.minusVerwendung(rudolph, 2147483641));
        System.out.println(einsaetze.minusVerwendung(rudolph, 299));
    }
}
