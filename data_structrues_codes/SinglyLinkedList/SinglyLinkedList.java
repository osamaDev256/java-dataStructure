package SinglyLinkedList;

public class SinglyLinkedList <E>{
		
	 	private Node<E> head;
	    private Node<E> tail;
	    private Node<E> curr;
	    private int size;

	    public SinglyLinkedList() {

	        head = null;
	        tail = null;
	        curr=null;
	        size = 0;
	    }

	// access methods
	    public int size() {//O(1)
	        return size;
	    }

	    public boolean isEmpty() {//O(1)
	        return size == 0;
	    }

	    public E first() { //O(1)
	        if (isEmpty()) {
	            return null;
	        }
	        return head.getElement();
	    }

	    public E last() { //O(1)
	        if (isEmpty()) {
	            return null;
	        }
	        return tail.getElement();
	    }

	// update methods
	    public void addFirst(E e) { //O(1)
	        head = new Node<>(e, head); 
	        if (size == 0) {
	            tail = head; 
	        }
	        size++;
	    }

	    
	    public void addLast(E e) { //O(1)
	        Node<E> newest = new Node<>(e, null); 
	        if (isEmpty()) {
	            head = newest; 
	        } 
	        else 
	        {
	            tail.setNext(newest); 
	        }
	        tail = newest; 
	        size++;
	    }

	    
	    public E removeFirst() { //O(1)
	        if (isEmpty()) {
	            return null; 
	        }
	        E answer = head.getElement();
	        head = head.getNext(); 
	        size--;
	        if (size == 0) {
	            tail = null; 
	        }
	        return answer;
	    }
	    
	    
	    
	    
	    
	  public E removeLast() { //O(n)
	        if (isEmpty()) {
	            return null; 
	        }
	        E answer = tail.getElement();
	        
	        if(head==tail) 
	        head=tail=null;
	               
	        else{
	        curr=head;
	        while(curr.getNext()!=tail)
	        curr=curr.getNext();
	        tail=curr;
	        curr.setNext(null);
	               
	        }
	        size--;
	        return answer;
	    }
	  
	  public void add(E element, int index)//O(n)
	    {
	        if (index < 0 || index > size) {
	            System.out.println("Out of bound!");
	            return;
	        }
	        Node<E> newest = new Node<E>(element, null);
	        if (index == 0) 
	        {
	            newest.setNext(head);
	            head = newest;
	            if (tail == null) {
	                tail = head;
	            }
	        } else // add the middle 
	        {
	            curr = head;
	            for (int i = 0; i < index - 1; i++) {
	                curr = curr.getNext();
	            }
	            newest.setNext(curr.getNext());
	            curr.setNext(newest);
	            if (tail == curr) {
	                tail = tail.getNext();
	            }
	        }
	        size++;
	    }

	    //removing node at index i
	    public E remove(int index) {//O(n)
	        if (index < 0 || index >= size) {
	            System.out.println("Out of bound!");
	            return null;
	        }
	        E element;
	        if (index == 0) 
	        {
	            element = head.getElement();
	            head = head.getNext();
	            if (head == null) {
	                tail = null;
	            }
	        } else 
	        {
	            curr = head;
	            for (int i = 0; i < index - 1; i++) {
	                curr = curr.getNext();
	            }
	            element =(E) curr.getNext().getElement();
	            if (tail == curr.getNext()) {
	                tail = curr;
	            }
	            curr.setNext(curr.getNext().getNext());
	        }

	        size--;
	        return element;
	    }
	    
	    

	      public void print() {//O(n)
	       if(head==null)
	           return;
	       
	        curr = head;
	        while (curr != null) {
	            System.out.print(curr.getElement()+" ");
	            curr = curr.getNext();
	        }
	}	
	      public void print(SinglyLinkedList<Integer> s) {//O(n)
		       if(head==null)
		           return;
		       
		        curr = head;
		        while (curr != null) {
		            System.out.print(curr.getElement()+" ");
		            curr = curr.getNext();
		        }
		}
	      
	      public void moveToStart() {//O(1)
	        curr = head;
	    }
	      
	    public void next() {//O(1)
	        if (curr != tail) {
	            curr = curr.getNext();
	        }
	    }
	    

	    public void moveToEnd() {//O(1)
	        curr = tail;
	    }

	    

	    public E getValue() {//O(1)
	        return curr.getElement();
	    }

	    //return the postion of current element
	    public int CurrPos() {//O(n)
	        Node<E> temp = head;
	        int i = 0;
	        while (temp != curr) {
	            temp = temp.getNext();
	            i++;
	        }
	        return i;
	    }

	    
	    //move curr to postion 
	    public E moveToPos(int pos) {//O(n)
	        if (pos < 0 || pos >= size) {
	            System.out.println("Position out of range!");
	            return null;
	        }
	        else {
	            curr = head;
	            for (int i = 0; i < pos; i++) 
	                curr = curr.getNext();
	             return curr.getElement();   
	            
	        }
	    }
	        public void swapFirstAndLast() { 
	        	if(head == null || head.getNext()==null)
	        		return ;
	        	
	        	
	        	else if(size == 2) { // swap in list of 2 nodes
	        		Node temp = head ;
	        		head = tail ;
	        		tail = temp ; 
	        		
	        		head.setNext(tail);
	        		tail.setNext(null);
	        	}
	        		
	        	else {	// swap in list more than 2 nodes
	        	Node f = head ; 
	        	Node L = tail ;
	        	
	        	
	        	head = head.getNext();
	        	Node crr = head;
	        	while(crr.getNext() != tail)
	        		crr = crr.getNext();
	        	tail = crr ;
	        	tail.setNext(null);
	        	
	        	L.setNext(head);
	        	head = L ;
	        	
	        	f.setNext(null);
	        	tail.setNext(f);
	        	tail = f;
	        	
	        	}
	        }
	        
	        public void splitOddEven(SinglyLinkedList<Integer> st1 , SinglyLinkedList<Integer> st2) {
	        	if(head == null || head.getNext() == null)
	        		return ;
	        	
	        	Node curr = head ;
	        	while(curr != null) {
	        		if(((Integer)curr.getElement() % 2) == 1)
	        			st1.addLast((Integer) curr.getElement());
	        		else
	        			st2.addLast((Integer) curr.getElement());
	        		curr = curr.getNext();
	        	}
	        }
	        
	        public SinglyLinkedList<Integer> reverse(SinglyLinkedList<Integer> s) {
	        	if(s.isEmpty())
	        		return null;
	        	
	        	SinglyLinkedList<Integer> temp = new SinglyLinkedList<Integer>();
	        	Node crr = head;
	        	while(crr != null) {
	        		temp.addFirst((Integer) crr.getElement());
	        		crr = crr.getNext();
	        	}
	        	return temp;
	       
	        }
	        public static void main(String[] args) {
	        	SinglyLinkedList<Integer> s = new SinglyLinkedList<>();
	        	s.addLast(1);
	        	s.addLast(2);
	        	s.addLast(3);
	        	s.addLast(4);
	        	s.print();
	        	System.out.println();
	        	s.print(s.reverse(s));
	        	
			}




	}
