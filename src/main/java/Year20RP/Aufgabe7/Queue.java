package Year20RP.Aufgabe7;

import java.util.Iterator;

public class Queue<E> implements Iterable<E>{
    /// Aufgabe A
    
    private SSL<E> head;
    private SSL<E> tail;

    private static class SSL<E>{
        E element;
        SSL<E> next;
        SSL(E element, SSL<E> next){
            this.element = element;
            this.next = next;
        }
    }

    public boolean isEmpty(){return head == null;}

    public void enqueue(E ele){
        if(ele == null) return;
        if(head == null){
            head = tail = new SSL<>(ele, null);
        } else {
            tail.next = new SSL<>(ele, null);
            tail = tail.next;
        }
    }

    public E getFirst(){
        return head.element;
    }

    public E dequeue(){
        E tmp = head.element;
        head = head.next;
        return tmp;
    }

    /// Aufgabe B
    
    public Iterator<E> iterator(){
        return new QIter();
    }

    private class QIter implements Iterator<E>{
        private SSL<E> iter = head;

        @Override
        public E next(){
            E tmp = iter.element;
            iter = iter.next;
            return tmp;
        }

        @Override
        public boolean hasNext(){
            return iter != null;
        }
    }

    /// Aufgabe C
    public <Z extends Comparable<Z>> Z max(Queue<Z> q){
        if(q == null || q.isEmpty()) throw new IllegalArgumentException();
        Z min = q.getFirst();
        for(Z m : q){
            if(m.compareTo(min) < 0){
                min = m;
            }
        }
        return min;
    }

    /// Aufgabe D
    
    public Queue<E> filter(Predicate<E> f){
        Queue<E> tmp = new Queue<>();
        for(E i : this){
            if(f.test(i)) tmp.enqueue(i);
        }
        return tmp;
    }
}
