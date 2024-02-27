package Lap7;

public class LinkedStack <E>{
	private Node2<E> top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(E data) {

        Node2<E> newNode = new Node2(data, top);
        top = newNode; 
        size++;
    }

    public E pop() {
        if(top == null){
        return null;}
        
        E t = top.data; 
        top = top.next; 
        size--;
        
        return t; 
    }

    public E top() {
        if(top == null){
        return null;}
        
        return top.data;
    }

}


