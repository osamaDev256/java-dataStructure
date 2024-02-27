package LapQuiz2;

import java.util.Scanner;

public class Exam {

    
///// Write your Method Here /////
	
	public static void ReverseProductType(LinkedQueue <Character> q) {
		if(q.isEmpty())
			return;
		
		LinkedQueue<Character> tempQueue = new LinkedQueue<>();
		LinkedStack<Character> tempStack = new LinkedStack<>();
		Object x ;
		int n = q.length();
		while(n != 0) {
			x =q.dequeue();		
			if(Character.isLetter((char) x)){
				tempStack.push((Character) x);
			}
			else
				tempQueue.enqueue((Character) x);
			n--;
		}
		while(!tempStack.isEmpty()) {
			q.enqueue(tempStack.pop());
		}
		while(!tempQueue.isEmpty())
			q.enqueue(tempQueue.dequeue());
			
			
	}
	
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter the product code before correcting : ");
    String x = input.next();
    
    // storing the product code to the Queue
    LinkedQueue <Character> ProductCode = new LinkedQueue <Character>();
    for (int i=0; i<x.length(); i++)
        ProductCode.enqueue(x.charAt(i));
   
    ///// Complete the code /////
 
    ProductCode.print();
    System.out.println();
    System.out.println("The product code after correcting : ");
    ReverseProductType(ProductCode);
    ProductCode.print();

    }
    
}

