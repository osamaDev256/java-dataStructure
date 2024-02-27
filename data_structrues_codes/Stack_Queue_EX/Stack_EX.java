package Stack_Queue_EX;

public class Stack_EX {
	
	static void print(LinkedStack<Integer>s){
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
	  {
		 if(k<=0||k>stk.size())
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
	 


	//====================================================
	static void delete_num(LinkedStack<Integer>s,int x){
	    
	LinkedStack<Integer>s2=new LinkedStack<Integer>();
	while(s.top()!=x)
	s2.push(s.pop());

	s.pop();

	while(s2.size()!=0)
	    s.push(s2.pop());

	}

	//=============================================
	  static void specialPush(LinkedStack<Integer>s,int x)
	{
		  System.out.println("");
	LinkedStack<Integer>s2=new LinkedStack<Integer>();
	if(s.size()==0)
	{
		s.push(x);
	return;
	}

	while(s.size()!=0&&s.top()<x)
	    s2.push(s.pop());


	s.push(x);
	while(s2.size()!=0)
	    s.push(s2.pop());
	}
	 
	
	//=====================================================================

	static void deleteMax(LinkedStack<Integer>s){
	    {
	int max=s.top();
	LinkedStack<Integer>s2=new LinkedStack<Integer>();

	int x;
	while(s.size()!=0)
	{
		x=s.pop();
	if(x>max)
		max=x;
	s2.push(x);
	}
	
	while(s2.top()!=max)
	s.push(s2.pop());
	s2.pop();
	while(!s2.isEmpty())
	    s.push(s2.pop());
	}
	}

	
		public static void main(String[] args) {
			LinkedStack<Integer> s = new LinkedStack<Integer>();
			s.push(10);
			s.push(20);
			s.push(30);
			s.push(40);
			s.print(s);
			//deleteMax(s);
			System.out.println();
			//specialPush(s, 15);
			//reverseK(s, 3);
			//s.print(s);
			specialPush(s, 25);
			System.out.println();
			s.print(s);
		}
	}

