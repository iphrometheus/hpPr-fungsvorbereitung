package Year22WP.Aufgabe7;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<E> implements Iterable<E>{ // Iterable muss auch parametrisiert sein
  // Aufgabe A:
    private SSL<E> head;
    private SSL<E> tail;

    private static class SSL<E>{
        E element; // muss public sein oder dann bei getFirst oder dequeue ein TypeCast
        SSL<E> next;

        SSL(E element, SSL<E> next){
            this.element = element;
            this.next = next;
        }

    }

    public void enqueue(E ele){
        if(ele == null) return;

        if(head == null){
            head = tail = new SSL<E>(ele, null);
        } else{
            tail.next = new SSL<E> (ele, null);
            tail = tail.next;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public E getFirst(){
        return head.element;
    }

    public E dequeue(){
        E tmp = head.element;
        head = head.next;
        return tmp;
    }

    // Aufgabe B:
    @Override
    public @NotNull Iterator<E> iterator() { // muss anscheinend so sein
        return new Qiter();
    }

    private class Qiter implements Iterator<E> {
        private SSL<E> iter = head;

        @Override
        public boolean hasNext() {
            return iter != null;
        }

        @Override
        public E next(){
            if (iter == null) throw new NoSuchElementException();
            E tmp = iter.element;
            iter = iter.next;
            return tmp;
        }

    }

    // Aufgabe C:
     /*
        Z ist als neuer Parameter

         Beim Vergleich q wird gegen min verglichen, wenn min < q wird das Ergebnis > 0 sein.
    */
    public  <Z extends Comparable<Z>> Z min(Queue<Z> queue){
        if(queue == null || queue.isEmpty()) throw new IllegalArgumentException(); // muss eine Methode sein

        Z min = queue.head.element;

        for(Z q : queue){
            if (q.compareTo(min) < 0) {
                min = q;
            }
        }
        
        return min;
    }

    // Aufgabe D:
    public Queue<E> filter (Predicate<E> filter){
        Queue<E> ret = new Queue<>();
        for(E r : this){
            if(filter.test(r)) ret.enqueue(r);
        }
        return ret;
    }

    // Aufgabe E:

    public static <O, U, T> Queue<O> combine(Queue<T> qf, Queue<U> qs, BiFunction<T, U, O> combine){
        Queue<O> combined = new Queue<>();

        Iterator<T> qfirst = qf.iterator();
        Iterator<U> qsecond = qs.iterator();

        while(qfirst.hasNext() && qsecond.hasNext()){
            combined.enqueue(combine.apply(qfirst.next(), qsecond.next()));
        }

        return combined;
    }

}