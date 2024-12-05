package Year22RP.Aufgabe7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<E> implements Iterable<E>{
    
    /// Aufgabe A:
    private SSL<E> head;
    private SSL<E> tail;

    private static class SSL<E>{
        public E element;
        public SSL<E> next;

        SSL(E element, SSL<E> next){
            this.element = element;
            this.next = next;
        }
    }

    boolean isEmpty(){
        return head == null;
    }

    void enqueue(E ele){
        if(ele == null) return;
        if(head == null){
            head = tail = new SSL<>(ele, null);
        } else{
            tail.next = new SSL<>(ele, null);
            tail = tail.next;
        }
    }

    E getFirst(){
        return head.element;
    }

    E dequeue(){
        E tmp = head.element;
        head = head.next;
        return tmp;
    }


    /// Aufgabe B:
    public Iterator<E> iterator(){
        return new QIter();
    }


    private class QIter implements Iterator<E>{
        private SSL<E> iter = head;

        @Override
        public boolean hasNext(){   /// darf nicht == sein, sondern muss != sein.
            return iter != null;
        }

        @Override
        public E next(){
            if(iter == null) throw new NoSuchElementException();
            E tmp = iter.element;
            iter = iter.next;
            return tmp;
        }
    }

    /// Aufgabe C:
    /// Damit min mit Queue.min() aufgerufen werden kann, muss min static sein
    ///
    static <Z extends Comparable<Z>> Z min(Queue<Z> queue){
        if(queue == null || queue.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Z tmp = queue.head.element;
        for(Z i : queue){
            if(i.compareTo(tmp) < 0){
                tmp = i;
            }
        }
        return tmp;
    }

    /// Aufgabe D:

    Queue<E> filter(Predicate<E> predicate){
        Queue<E> tmp = new Queue<>();
        for(E i: this){
            if(predicate.test(i)){
                tmp.enqueue(i);
            }
        }
        return tmp;
    }

    /// Aufgabe E:

    static <T, U, O> Queue<O> combines (Queue<T> q1, Queue<U> q2, BiFunction<T, U, O> app){
        if(q1.isEmpty() || q2.isEmpty()) return new Queue<>();
        Queue<O> qu = new Queue<>();

        Iterator<T> qIter1 = q1.iterator();
        Iterator<U> qIter2 = q2.iterator();

        while (qIter1.hasNext() && qIter2.hasNext()) {
            qu.enqueue(app.apply(qIter1.next(), qIter2.next()));             
        }

        return qu;
    }
}
