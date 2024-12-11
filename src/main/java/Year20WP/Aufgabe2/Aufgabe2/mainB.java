package Year20WP.Aufgabe2.Aufgabe2;

import Year20WP.Aufgabe2.MailSubscriber;

public class mainB {
    public static void main(String[] args) {
        MailSubscriber s1 = (new MailSubscriber.Builder())
                .setName("Baumann")
                .setEmail("t61aanba@unibw.de")
                .create();
        System.out.println(s1.toString());
        MailSubscriber s2 = (new MailSubscriber.Builder())
                .setEmail("arthur@dent.com")
                .setName("dent").create();
        System.out.println(s2.toString());

        try{
            (new MailSubscriber.Builder())
                    .setName("Özil")
                    .setEmail("özil@tets.de").create();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            (new MailSubscriber.Builder())
                    .setEmail("özil@tets.de")
                    .setName("oezil").create();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
