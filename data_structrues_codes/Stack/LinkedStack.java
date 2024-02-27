package Stack;

public class LinkedStack<E> {
	SinglyLinkedList<E> list = new SinglyLinkedList<E>();
	
	public LinkedStack() {
		
	}
	public int size() {
		return list.size();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public void push(E e) {
		list.addFirst(e);
	}
	public E pop() {
		return list.removeFirst();
	}
	public E top() {
		return list.first();
	}
	
	public static void print(LinkedStack<Integer>s){
	    System.out.println("-------");
	LinkedStack<Integer>s2=new LinkedStack<Integer>();
	int x;
	while(!s.isEmpty())
	{x=s.pop();
	    System.out.println(x);
	    s2.push(x);
	}

	while(s2.size()!=0)
	    s.push(s2.pop());
	}
	 

	//=========================================
	public static void revers_Stack(LinkedStack<Integer>s){
	LinkedStack<Integer>temp=new LinkedStack();
	LinkedStack<Integer>rev=new LinkedStack();
	while(!s.isEmpty())
	    temp.push(s.pop());


	while(!temp.isEmpty())
	{rev.push(temp.pop());
	}


	while(!rev.isEmpty())
	{s.push(rev.pop());
	}

	    
	}
	//======================================================
	 public static void reverseK(LinkedStack<Integer>stk,int k)
	  {if(k<=0||k>stk.size())
	  return;
	  
	  LinkedStack<Integer>temp1=new LinkedStack<Integer>();
	  LinkedStack<Integer>last=new LinkedStack<Integer>();
	  for(int i=0;i<k;i++)
	    temp1.push(stk.pop());
	      
	    for(int i=0;i<k;i++)
	  last.push(temp1.pop());
	    
	     for(int i=0;i<k;i++)
	    stk.push(last.pop());
	  
	    
	  }
	  //===================================
	  
	  public static LinkedStack Copy_Stack(LinkedStack<Integer>stk){
	LinkedStack<Integer>temp=new LinkedStack();
	LinkedStack<Integer>copy=new LinkedStack();
	while(!stk.isEmpty())
	    temp.push(stk.pop());

	int x;
	while(!temp.isEmpty())
	{x=temp.pop();
	copy.push(x);
	stk.push(x);
	}

	return copy;
	    
	}

}
