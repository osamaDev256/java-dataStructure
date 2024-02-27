package Lap7;

public class LinkedQueue <E>{

	    private Node2<E> front;    
	    private Node2<E> last;     
	    private int size;		          

	    
	    public LinkedQueue() {
	        front = last = null;
	        size = 0;
	    }

	    public boolean isEmpty() {
	        if (size == 0) {
	            return true;
	        }
	        return false;
	    }

	    
	    public int length() {
	        return size;
	    }
	    
	  
	    public void clear() {
	        front = last = null;
	        size = 0;
	    }

	    
	    public void enqueue(E data) {
	        Node2<E> temp = new Node2<E>(data, null);
	        if (size == 0) {
	            front = last = temp;
	        } else {
	            last = last.next = temp;
	        }
	        size++;
	    }


	    
	    public E dequeue() {
	        if (size == 0) {
	            System.out.println("Queue is empty");
	            return null;
	        }
	        E data = front.data;  
	        front = front.next; 
	        if (front == null) {
	            last = front;
	        }
	        size--;
	        return data;                     
	    }

	   
	    public E frontValue() {
	        if (size == 0) {
	            System.out.println("Queue is empty");
	            return null;
	        }
	        return front.data;
	    }
	}


