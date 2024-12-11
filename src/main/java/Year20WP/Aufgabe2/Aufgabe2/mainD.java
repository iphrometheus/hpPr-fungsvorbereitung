package Year20WP.Aufgabe2.Aufgabe2;

import Year20WP.Aufgabe2.MailSubscriber;

import java.util.PriorityQueue;

public class mainD {
    public static void main(String[] args) {
        PriorityQueue<MailSubscriber> subscribers = new PriorityQueue<>();

        MailSubscriber s1 = (new MailSubscriber.Builder())
                .setName("Baumann").setEmail("t61aanba@unibw.de").create();
        MailSubscriber s2 = (new MailSubscriber.Builder())
                .setEmail("arthur@dent.com").setName("dent").create();

        subscribers.add(s1);
        subscribers.add(s2);

        while (!subscribers.isEmpty()) {
            System.out.println(subscribers.poll());
        }
    }
}
