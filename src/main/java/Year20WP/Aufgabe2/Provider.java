package Year20WP.Aufgabe2;

import java.util.Arrays;
import java.util.HashSet;

public abstract class Provider<M> {
    /*private HashSet<Subscribable<M>> subscribers = new HashSet<>();

    public synchronized void subscribe(Subscribable<M> subscribable) {
        if (subscribable != null)
            subscribable.add(subscribable);
    }

    public synchronized void unsubscrible(Subscribable<M> subscribable) {
        if (subscribable != null)
            subscribable.remove(subscribable);
    }

    public void post(M message) {
        Subscribable<M>[] tmp;
        synchronized (this) {
            tmp = this.subscribers.toArray(new Subscribable[0]);
        }
        Arrays.stream(tmp).parallel()
                .forEach(s -> (new Thread(() -> s.send(message))).start());
    }*/
}
