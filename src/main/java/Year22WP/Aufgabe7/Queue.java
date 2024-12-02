package Year22WP.Aufgabe7;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Queue<E> implements Iterable{
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
            E tmp = iter.element;
            iter = iter.next;
            return tmp;
        }

    }

}