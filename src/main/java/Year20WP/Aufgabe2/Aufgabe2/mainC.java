package Year20WP.Aufgabe2.Aufgabe2;

import Year20WP.Aufgabe2.MailSubscriber;

import java.util.HashMap;

public class mainC {
    public static void main(String[] args) {
        HashMap<MailSubscriber, String> realNames = new HashMap<>();
        // Zwei Objekte haben beim Erstellen eine andere Referenz somit resultiert das der entstehende Hashcode ungleich
        // des ersten Objektes ist

        MailSubscriber s1 = (new MailSubscriber.Builder())
                .setName("Baumann").setEmail("t61aanba@unibw.de").create();
        MailSubscriber s2 = (new MailSubscriber.Builder())
                .setEmail("arthur@dent.com").setName("dent").create();

        realNames.put(s1 , "Andrea Baumann");
        realNames.put(s2, "Arthur Dent");

        MailSubscriber suche = (new MailSubscriber.Builder())
                .setName("Unbekannt").setEmail("t61aanba@unibw.de").create();

        System.out.println("Klarname von 'suche': " + realNames.get(suche));
    }
}
