
package CircularlyLinkedList;

public class CircularlyLinkedList<E> {
		
		private Node<E> tail;
	    private int size;

	    public CircularlyLinkedList() {
	        tail = null;
	        this.size = 0;
	    }

	    public boolean empty() {
	        return size == 0;
	    }

	    public int size() {

	        return size;
	    }

	    public E first() {
	        if (empty())
	            return null;
	        return tail.getNext().getElement();
	    }

	    public E last() {
	        if (empty())
	            return null;
	        return tail.getElement();
	    }

	    public void addFirst(E e) {
	        if (empty()) {
	            tail = new Node(e, null);
	            tail.setNext(tail);
	        } else {
	            Node node = new Node(e, tail.getNext());
	            tail.setNext(node);
	        }
	        size++;
	    }

	    public void addLast(E e) {
	        addFirst(e);
	        tail = tail.getNext();
	    }

	    public E removeFirst() {
	        if (empty())
	            return null;
	        Node<E> temp = tail.getNext();
	        if (size == 1) {
	            tail = null;
	        } else {
	            tail.setNext(tail.getNext().getNext());
	        }

	        size--;
	        return temp.getElement();
	    }
	    
	    public void rotateBy(int N) {
	    	if(tail.getNext() == null || tail == null)
	    		return ;
	    
//	    	for(int i = 0 ; i<N ; i++)
//	    		rotate();
//	    	Node<E> x = tail;
//			Node<E> y = null ;
			Node curr = tail.getNext();
	    	while(curr != tail)
	    		curr = curr.getNext();
	    	curr = tail.getNext();
	    	tail = tail.getNext().getNext();
	    	

	    	
	    }
	    
	    public void rotate() {
	    	if(tail != null)
	    	tail = tail.getNext();
	    }

	    public void print() {
	        Node<E> curr = tail.getNext();
	        for (int i = 0; i < size; i++) {
	            System.out.print(curr.getElement()+" ");
	            curr = curr.getNext();
	        }

	    }
	    public static void main(String[] args) {
	    CircularlyLinkedList<Integer> c = new CircularlyLinkedList<Integer>();
	    c.addLast(1);
	    c.addLast(2);
	    c.addLast(3);
	    c.addLast(4);
	    c.print();
	    System.out.println();
	    c.rotateBy(2);
	//    c.rotate();
//	    c.rotate();
	    c.print();
	    
	    }
	}

