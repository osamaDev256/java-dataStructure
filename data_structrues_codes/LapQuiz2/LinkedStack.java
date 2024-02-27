package LapQuiz2;

public class LinkedStack <E> {

    private Node<E> top;
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
// Make a new node whose next reference is the existing list
        Node<E> newNode = new Node(data, top);
        top = newNode; // top points to new node
        size++;
    }

    public E pop() {
        if(top == null)
        return null;
        
        E t = top.data; // Save the value at the top of the stack
        top = top.next; // Make top reference points to the next node in the stack
        size--;
        
        return t; // return the removed value
    }

    public E top() {
        if(top == null)
        return null;
        
        return top.data;
    }
    
   
    
//    public void print() {
//        if (size == 0) {
//            System.out.println("Queue is empty");
//
//        }
//       LinkedStack temp=new LinkedStack();
//        while(!isEmpty()) {
//            System.out.print(top());
//            System.out.print(" ");
//          temp.push(pop());
//        }
//        
//        while(!temp.isEmpty())
//          push((E)temp.pop())  ;
//            
//            
//        System.out.println("");
//
//    }

     public void print() {
        if (size == 0) {
            System.out.println("Stack is empty");

        }
        
       LinkedStack temp=new LinkedStack();
       int n=size;
       for(int i=0;i<n;i++) {
            System.out.print(top());
            System.out.print(" ");
          temp.push(pop());
        }
        
        for(int i=0;i<n;i++)
          push((E)temp.pop())  ;
            
            
        System.out.println("");

    }
}



