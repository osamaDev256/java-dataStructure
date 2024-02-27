package Stack_Queue_EX;



public class EX <E>{
	
	public static void add_in_dex_in_queue(LinkedQueue<Integer>qu,int dex,int num) {
	   
	   if(dex<0||dex>qu.size())
	   return;
	   LinkedQueue<Integer>temp=new LinkedQueue();
	   
	  if(dex==0)
	  { 
		  temp.enqueue(num);
	  while(!qu.isEmpty())
	      temp.enqueue(qu.dequeue());
	   while(!temp.isEmpty())
	      qu.enqueue(temp.dequeue());
	   }
	  
	  else
	  {
	    while(!qu.isEmpty())
	      temp.enqueue(qu.dequeue());
	   
	    for(int i=0;i<dex-1;i++)
	   qu.enqueue(temp.dequeue());
	    
	   qu.enqueue(num);
	  
	   while(!temp.isEmpty())
	       qu.enqueue(temp.dequeue());}
	   }
	
	   //===================================================
	   public static void delete_from_dex_que(LinkedQueue<Integer>que,int dex) {
	   if(dex<0||dex>=que.size())
	   return;
	   if(dex==0)
	   {  que.dequeue();
	   return;
	   }
	   
	   LinkedQueue<Integer>temp=new LinkedQueue();
	   while(!que.isEmpty())
	   temp.enqueue(que.dequeue());
	   
	   for(int i=0;i<dex;i++)
	       que.enqueue(temp.dequeue());
	       temp.dequeue();
	        while(!temp.isEmpty())
	   que.enqueue(temp.dequeue());
	   
	   }
	   
	   
	   //=========================================================
	 

	 public static void add_in_index_Stack(LinkedStack<Integer>stk,int dex,int num){
	   if(stk.isEmpty())
	       return;
	   if(dex<0||dex>stk.size())
	       return;

	   LinkedStack<Integer>temp=new LinkedStack();
	   int n=stk.size();
	   
	   for(int i=0;i<n-dex;i++)
	   {temp.push(stk.pop());
	      
	   }
	       
	   stk.push(num);
	      
	   while(!temp.isEmpty())
	       stk.push(temp.pop());
	   }
	   
	   
	   //==================================
	   public static void delete_index_from_stack(LinkedStack<Integer>stk,int dex){
	  if(stk.isEmpty())
	      return;
	       if(dex<0||dex>=stk.size())
	   return;
	       
	   int n=stk.size();
	      
	   LinkedStack<Integer>temp=new LinkedStack();
	   
	   for(int i=0;i<n-dex;i++)
	       temp.push(stk.pop());
	   temp.pop();
	   while(!temp.isEmpty())
	       stk.push(temp.pop());
	   }
	   
	   public static void delete_num_from_Stack(LinkedStack<Integer>stk , int num) {
		   if(stk.size() == 0)
			   return;
		   LinkedStack<Integer> temp = new LinkedStack<>();
		   while(stk.top() != num) {
			   temp.push(stk.pop());
		   }
		   stk.pop();
		   
		   while(!temp.isEmpty()) {
			   stk.push(temp.pop());
		   }
	   }
	   
	   public static int max_stack(LinkedStack<Integer>s){
		   if(s.isEmpty())
			   return 0;
		   
		   LinkedStack<Integer> temp = new LinkedStack<Integer>();
		   int max = s.top();
		   int x ;
		   while(!s.isEmpty()) {
			   x = s.pop();
			   if(x > max)
				   max = x ;
			   temp.push(x);
		   }
		   
		   while(!temp.isEmpty()) {
			   x = temp.pop();
		   		if(x != max)
		   			s.push(x);
		   }
		   return max ;
	   }
	   
	   
	  public static void print(LinkedQueue q) {
	        int n = q.size();

	        Object x;
	        while (n != 0) {
	            x = q.dequeue();
	            System.out.print(" " + x);
	            q.enqueue(x);
	            n--;
	        }
	    }
	  
	   
	  public static void print(LinkedStack<Integer>s){
		    System.out.println("-------");
		LinkedStack<Integer>s2=new LinkedStack<Integer>();
		int x;
		while(!s.isEmpty())
		{x=s.pop();
		    System.out.print(x+" ");
		    s2.push(x);
		}
		System.out.println();

		while(s2.size()!=0)
		    s.push(s2.pop());
		}
	//===================================
	  public static int SecondMax(LinkedQueue<Integer> q)
	  {
	      int max=q.first();
	      int secmax=0;
	  for(int i=0;i<q.size();i++){
		  int x=q.dequeue();
	    
	  if(x>max)
	      {secmax=max;
	          max=x;
	      }
	      else
	      { if(x>secmax&&x!=max)
	        secmax=x;}
	      
	      q.enqueue(x);
	    }
	    return secmax;
	  }  
	  
	  public static int Max(LinkedQueue<Integer> q)
	  {
	      int max=q.first(),secmax=0;
	      
	  for(int i=0;i<q.size();i++) {
	  int x=q.dequeue();
	    
	  if(x>max) {
	      secmax=max;
	          max=x;
	      }
	      else
	      { if(x>secmax&&x!=max)
	        secmax=x;}
	      
	      q.enqueue(x);
	    }
	    return max;
	  }    

	   

	    //======================================
	    static void add_sorted(LinkedQueue<Integer> q, int x) {
	     
	        if (q.size() == 0) {
	            q.enqueue(x);
	            return;
	        }  
	        LinkedQueue<Integer> q2 = new LinkedQueue<Integer>();
	        while (q.size() != 0 && q.first() < x) {
	            q2.enqueue(q.dequeue());
	        }
	        q2.enqueue(x);
	        while (q.size()!= 0) {
	            q2.enqueue(q.dequeue());
	        }
	        while (q2.size() != 0) {
	            q.enqueue(q2.dequeue());
	        }

	    }
	//==============================================
	     static boolean isfound(LinkedQueue<Integer> q, int key) {
	       if(q.isEmpty())
	          return false;
	       
	        int n = q.size();
	        boolean flag = false;
	        int x;
	        for (int i = 0; i < n; i++) {
	            x = q.dequeue();
	            if (x == key) {
	                flag = true;
	            }
	            q.enqueue(x);
	        }
	               return flag;
	   }
	//============================================   
	    static void delet_num(LinkedQueue<Integer> q, int num) {
	      if(q.isEmpty())
	          return;
	      
	      if(isfound(q, num)==false)
	      { System.out.println("number not found !");
	      return;
	      }
	      
	        int n = q.size();
	        int x;
	        while (n != 0) {
	            x = q.dequeue();
	            if (x != num) {
	                q.enqueue(x);
	            }
	            n--;
	        }

	    }

	
	    static void delete_dublecate(LinkedQueue<Integer> q) { // ??? 
	     if(q.size()<2)
	          return;
	     
	        LinkedQueue<Integer> q2 = new LinkedQueue<Integer>();

	        int key;
	        while (!q.isEmpty()) {
	            key = q.dequeue();

	            if (isfound(q2, key) == false) {
	                q2.enqueue(key);
	            }
	        }

	        while (!q2.isEmpty()) {
	            q.enqueue(q2.dequeue());
	        }
	    }

	    //=================================================
	    
	    static void SwapTwo(LinkedQueue<Integer> q) {
	       if(q.size()<2)
	          return;
	        int x = 0, y = 0;
	        int n = q.size();
	        
	       for(int i=0;i<n/2;i++) {
	            x = q.dequeue();
	            y = q.dequeue();
	            q.enqueue(y);
	            q.enqueue(x);
	           
	        }
	        if (q.size() % 2 == 1) {
	            q.enqueue(q.dequeue());
	        }
	    }
	//=================================================
	    public static void swapfirstLast(LinkedQueue<Integer> q) {
	      
	      if(q.size()<2)
	          return;
	      	
	        int x;
	        int s;
	        x = q.dequeue();
	        s = q.size();
	       System.out.println(s);
	        for(int i=0;i<s-1;i++)
	            q.enqueue(q.dequeue());

	        q.enqueue(x);

	    }
	    
	   //===========================================
	    public static void swapfirstSecond(LinkedQueue<Integer> q) {
	     
	      if(q.size()<2)
	          return;
	        int x, y;

	        x = q.dequeue();
	        y = q.dequeue();
	        int s = q.size();

	        q.enqueue(y);
	        q.enqueue(x);
	        while (s != 0) {
	            q.enqueue(q.dequeue());
	            s--;
	        }

	    }

	  //========================================
	    public static void chang_que(LinkedQueue<Integer> q , int n) { // ???	
	        if(q.isEmpty())
	          return;
	        
	        ArrayStack<Integer> s = new ArrayStack<Integer>();
	        for (int i = 0; i < n; i++) { // 4
	            s.push(q.dequeue());
	        }
	    
	        for (int i = 0; i < n; i++) {
	            q.enqueue(s.pop());
	        }
    
	        for (int i = 0; i < q.size()-n; i++) {
	            q.enqueue(q.dequeue());
	        }
	        System.out.println("\n\n");

	    }

	    
	  //=====================

	    
	    //===============================
	    public static void oddEven(LinkedQueue<Integer> q) { // important !!
	         if(q.size()<2)
	          return;
	     
	        LinkedQueue<Integer> temp = new LinkedQueue<Integer>();
	        int x;
	        int s = q.size();
	        while (s != 0) {
	            x = q.dequeue();
	            if (x % 2 == 0) {
	                temp.enqueue(x);
	            } else {
	                q.enqueue(x);
	            }
	            s--;

	        }
	        while (!temp.isEmpty()) {
	            q.enqueue(temp.dequeue());
	        }

	    }
	    
	    public static void ArrangeStack(LinkedStack<Integer> s) {
	    	if(s.isEmpty())
	    		System.out.println("the stack is Empty !");
	    	LinkedStack<Integer> even = new LinkedStack<Integer>();
	    	LinkedStack<Integer> odd = new LinkedStack<Integer>();
	    	int x ;
	    	while(!s.isEmpty()) {
	    		x = s.pop();
	    		if(x % 2 == 0)
	    			even.push(x);
	    		else
	    			odd.push(x);
	    	}
	    	while(!odd.isEmpty()) 
	    		s.push(odd.pop());
	    	
	    	while(!even.isEmpty())
	    		s.push(even.pop());
	    }
	    
	    public static void Sum_and_Add(LinkedStack<Integer> s , int a , int b) {
	    	if(s.isEmpty())
	    		return;
	    	LinkedStack<Integer> temp = new LinkedStack<Integer>();
	    	//LinkedStack<Integer> temp2 = new LinkedStack<Integer>();

	    	int x ;
	    	int sum = 0;
	    	while(!s.isEmpty()) {
	    		x = s.pop();
	    		if(x >= a && x <= b)
	    			if(x % 2 == 0) 
	    				sum += x;
	    		temp.push(x);
	    		}
 		
	    		while(!temp.isEmpty())
	    			s.push(temp.pop());
	    		s.push(sum);
    	
	    }
	    
	    public static void sort(LinkedQueue<Integer> q) {
	        LinkedQueue<Integer> temp = new LinkedQueue();
	        while (!q.isEmpty()) {//start
	            int mini = q.first();
	            for (int i = 0; i < q.size(); i++) {
	                int x = q.dequeue();
	                if (x < mini) 
	                    mini = x;
	                   q.enqueue(x);
	            }
	            temp.enqueue(mini);
	            int n = q.size();
	            for (int i = 0; i < n; i++) {
	                if (q.first() != mini) {
	                    q.enqueue(q.dequeue());
	                } else {
	                    q.dequeue();
	                }
	            }
	        }

	        while (!temp.isEmpty()) {
	            q.enqueue(temp.dequeue());
	        }

	    }
	    //===================================

	    public static void add_After_Mini(LinkedQueue<Integer> q, int num) {
	        if (q.isEmpty()) {
	            return;
	        }
	        int mini = q.first();
	        for (int i = 0; i < q.size(); i++) {
	            int x = q.dequeue();
	            if (x < mini) {
	                mini = x;
	            }
	            q.enqueue(x);
	        }
	        //====================
	        int x;
	        int s = q.size();
	        for (int i = 0; i < s; i++) {
	            x = q.dequeue();
	            if (x == mini) {
	                q.enqueue(x);
	                q.enqueue(num);
	            } else {
	                q.enqueue(x);
	            }

	        }
	    }
	    
	    public static void dudu(LinkedStack<Integer>s ) {
	    	if(s.isEmpty())
	    		return;
	    	
	    	LinkedStack<Integer> temp = new LinkedStack<Integer>();
	    	int x ;
	    	while(!s.isEmpty()) {
	    		x = s.pop();
	    		temp.push(x);
	    		temp.push(x);
	    	}
	    	while(!temp.isEmpty())
	    		s.push(temp.pop());
	    }
	    
	    public static void ReverseDigits( LinkedQueue<Character>que){
	    	   if(que.isEmpty())
	    	       return;
	    	   
	    	       LinkedStack<Character>s=new LinkedStack();
	    	  int n=que.size();
	    	       for(int i=0;i<n;i++)
	    	    {
	    	        
	    	        char ch=que.dequeue();
	    	    if(Character.isLetter(ch))
	    	    {
	    	        que.enqueue(ch);
	    	    
	    	    }
	    	    else
	    	    {
	    	     que.enqueue('0');
	    	    s.push(ch);
	    	    }
	    	        }
	    	     
	    	     for(int i=0;i<n;i++)
	    	    {char ch=que.dequeue();
	    	    if(Character.isLetter(ch))
	    	        
	    	    {que.enqueue(ch);
	    	   
	    	       }
	    	    else
	    	         que.enqueue(s.pop());	    	    
	    	   }
	    	   }
	    
	 public static void main(String[] args) {
		 LinkedQueue<Integer> one = new LinkedQueue<>();
		 one.enqueue(1);
		 one.enqueue(2);
		 one.enqueue(3);
		 one.enqueue(4);
		 one.enqueue(5);
		 one.enqueue(6);
		 print(one);
		 chang_que(one, 4);
		 System.out.println();
		// swapfirstLast(one);
		 print(one);
//		 LinkedStack<Integer> s = new LinkedStack<Integer>();
//		 s.push(1);
//		 s.push(2);
//		 s.push(3);
//		 s.push(4);
//		 print(s);
//		 dudu(s);
//		 System.out.println();
//		 print(s);
		 
//		 LinkedQueue<Character>que=new LinkedQueue();
//		 que.enqueue('A');
//		 que.enqueue('1');
//		 que.enqueue('B');
//		 que.enqueue('2');
//		 que.enqueue('C');
//		 que.enqueue('D');
//		 que.enqueue('3');
//		 que.enqueue('4');
//		 que.enqueue('E');
//		 EX a = new EX<>();
//		 print(que);
//		// a.ReverseDigit(que);
//		 System.out.println();
		 //print(que);
		 
//		 que.enqueue(1);
//		 que.enqueue(2);
//		 que.enqueue(3);
//		 que.enqueue(4);
//		 que.enqueue(5);
//		 print(que);
//		 chang_que(que, 2);
//		 print(que);
//		 print(que);
//		 System.out.println();
//		 //SwapTow(que);
//		 //swapfirstLast(que);
//		// chang_que(que, 4);
//		//print(que);
//		 oddEven(que);
//		 print(que);
//		 LinkedQueue<Integer>que2=new LinkedQueue();
//		 add_sorted(que2, 5);
	// add_sorted(que2, 4);
//		 add_sorted(que2, 9);
//		 add_sorted(que2, 12);
//		 //print(que2);
//		 //=================================================
//		 LinkedStack<Integer> stack = new LinkedStack<Integer>();
//		 stack.push(0);
//		 stack.push(1);
//		 stack.push(2);
//		 stack.push(3);
//		 stack.push(6);
//		 stack.push(5);
//		 stack.push(10);
//		 print(stack);
//		// Sum_and_Add(stack, 0, 6);
//		// print(stack);

//	       System.out.println("max is : " + Max(que));
//	       
//	       System.out.println("\nsecond max is "+SecondMax(que));
	    
	   //================================================ 
	 }
}
