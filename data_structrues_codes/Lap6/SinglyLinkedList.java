package Lap6;

public class SinglyLinkedList <E> {

	    private Node<E> head;
	    private Node<E> tail;
	    private Node<E> curr;   // Acess to current element
	    private int size;

	    public SinglyLinkedList() {

	        head = null;
	        tail = null;
	        curr = null;
	        size = 0;
	    }
	//Remove all elements

	    public void clear() {
	        head = tail = null;
	        size = 0;
	    }
	// access methods

	    public int size() {
	        return size;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public E first() { // returns (but does not remove) the first element
	        if (isEmpty()) {
	            return null;
	        }
	        return head.getElement();
	    }

	    public E last() { // returns (but does not remove) the last element
	        if (isEmpty()) {
	            return null;
	        }
	        if(head.getNext()==null)
	        return head.getElement();
	       
	        Node cur=head;
	        while(cur.getNext()!=null)
	        cur=cur.getNext();
	        
	        return (E)cur.getElement();
	       
	       // return tail.getElement();
	    }

	    
	    
	    
	    
	    
	    
	    
	// update methods
	    public void addFirst(E e) { // adds element e to the front of the list
	        head = new Node<>(e, head); // create and link a new node
	        if (size == 0) {
	            tail = head; // special case: new node becomes tail also
	        }
	        size++;
	    }

	    public void addLast(E e) { // adds element e to the end of the list
	        Node<E> newest = new Node<>(e, null); // node will eventually be the tail
	        if (isEmpty()) {
	            head = newest; // special case: previously empty list
	        } else {
	            tail.setNext(newest); // new node after existing tail
	        }
	        tail = newest; // new node becomes the tail
	        size++;
	    }

	    public E removeFirst() { // removes and returns the first element
	        if (isEmpty()) {
	            return null; // nothing to remove
	        }
	        E answer = head.getElement();
	        head = head.getNext(); // will become null if list had only one node
	        size--;
	        if (size == 0) {
	            tail = null; // special case as list is now empty
	        }
	        return answer;
	    }

	    // Add 
	    public void add(E element, int index) {
	        if (index < 0 || index > size) {
	            System.out.println("Out of bound!");
	            return;
	        }
	        Node<E> newest = new Node<E>(element, null);
	        if (index == 0) // add at front
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
	    public E remove(int index) {
	        if (index < 0 || index >= size) {
	            System.out.println("Out of bound!");
	            return null;
	        }
	        E element;
	        if (index == 0) // remove from front
	        {
	            element = head.getElement();
	            head = head.getNext();
	            if (head == null) {
	                tail = null;
	            }
	        } else {
	            curr = head;
	            for (int i = 1; i < index ; i++) {
	                curr = curr.getNext();
	            }
	            element = curr.getNext().getElement();
	            if (tail == curr.getNext()) {
	                tail = curr;
	            }
	            curr.setNext(curr.getNext().getNext());
	        }

	        size--;
	        return element;
	    }

	    // 
	    public void moveToStart() {
	        curr = head;
	    }

	    public void moveToEnd() {
	        curr = tail;
	    }

	    public void next() {
	        if (curr != tail) {
	            curr = curr.getNext();
	        }
	    }

	    public E getValue() {
	        return curr.getElement();
	    }

	    //return the postion of current element
	    public int CurrPos() {
	        Node<E> temp = head;
	        int i = 0;
	        while (temp != curr) {
	            temp = temp.getNext();
	            i++;
	        }
	        return i;
	    }

	    
	    //move curr to postion 
	    public void moveToPos(int pos) {
	        if (pos < 0 || pos >= size) {
	            System.out.println("Position out of range!");
	        } else {
	            curr = head;
	            for (int i = 0; i < pos; i++) {
	                curr = curr.getNext();
	            }
	        }
	    }

	    
	    public void print() {
	        curr = head;
	        while (curr != null) {
	            System.out.println(curr.getElement());
	            curr = curr.getNext();
	        }
	    }

	   //==================================
	    public void deleteSecond(){
	        if(head==null||head.getNext()==null)
	            return;
	        head.setNext(head.getNext().getNext());
	    if(head.getNext()==null)
	        tail=head;
	    size--;
	    }
	    //============================
	//public void removeSpecificNode(int n)
	//{
//	    if (isEmpty()){
	//System.out.println("Cannot remove from empty list ");
//	    return; }
//	    Node temp = head;
	//   
	//    
	//    
//	        if((Integer)head.getElement() == n )
//	        {     head = head.getNext();
//	              size--;
//	        }         
//	        else    
//	        {
//	            while((Integer)temp.getNext().getElement() != n )
//	             
//	              temp = temp.getNext();
	//
//	            
//	                 if(temp.getNext() == tail)
//	                     tail = temp;
//	                 
	//temp.setNext(temp.getNext().getNext());
//	                 size--;
//	                 return;
//	             }
//	    }
	    //============================================
	    public void removeSpecificNode(int n)
	{
	  Node temp = head;
	   Node temp2=null; 
	    
	    if (isEmpty()){
	System.out.println("Cannot remove from empty list ");
	    return; }
	   
	       
	        if((Integer)head.getElement() == n )
	        {     head = head.getNext();
	              size--;
	        } 
	             
	        
	        else 
	              
	        {
	            while((Integer)temp.getElement() != n )
	            {
	                temp2=temp;
	              temp = temp.getNext();
	            }
	            
	                 if(temp == tail)
	                     tail = temp2;
	                 
	temp2.setNext(temp.getNext());
	                 size--;
	                 
	             }
	    }
	    
	    
	    //==============================
	    public void addNodeBefour(int k , int d)
	{
	    if (isEmpty()){
	System.out.println("Cannot add ");
	    return; }
	    Node curr = head;
	    
	   
	       if((Integer)curr.getElement()==k)
	       {Node n=new Node(d,head);
	       head=n;
	       return;
	       }
	           
	        while((Integer)curr.getNext().getElement() != k )
	           curr = curr.getNext();


	        Node n=new Node(d,curr.getNext());
	             curr.setNext( n);

	        size++;
	    }
	    
	 //=========================================
	public void addNodeAfter(int d , int k){
	if (isEmpty()){
	head=tail=new Node(d,null);
	  size++;
	  return;
	}
	     curr = head;
	    
	            while(curr!=null&&(Integer)curr.getElement() != k  )
	           curr = curr.getNext();
	       
	 if(curr==null)
	            { tail.setNext(new Node(d,null));
	            tail=tail.getNext();
	            
	            }
	  
	 else
	            
	                                     
	        {
	            Node n=new Node(d,curr.getNext());
	             curr.setNext(n);
	if(tail==curr)
	      tail=tail.getNext();
	        }
	         size++;
	}

	//=====================
	public void removeOdd(){
	       Node temp=head;
	               
	    while(temp.getNext()!=null)
	    {    if((Integer)head.getElement()%2==1)
	    {head=head.getNext(); 
	       temp=head;
	    continue;
	    }
	        
	      if((Integer)temp.getNext().getElement()%2==1)
	    temp.setNext(temp.getNext().getNext());
	    else
	        temp=temp.getNext();
	    }
	}

	//================================
	public void swapxy(int x,int y)
	{if(head==null||head.getNext()==null)
	    return;
	    Node temp1=head;
	    Node temp2=head;
	while((Integer)temp1.getElement()!=x)
	temp1=temp1.getNext();

	while((Integer)temp2.getElement()!=y)
	temp2=temp2.getNext();



	int swp=(Integer)temp1.getElement();
	temp1.setElement(temp2.getElement());
	temp2.setElement(swp);

	}       
	        
	//===============================================

	//public void shiftToFirst(int x){
	//Node curr=head;
	//Node cur2=null;
	//while((Integer)curr.getElement()!=x)
	//{cur2=curr;
	//curr=curr.getNext();}
	//cur2.setNext(curr.getNext());
	//curr.setNext(head);
	//head=curr;
	//}
	public void shiftToFirst(int x){
	Node curr=head;

	while((Integer)curr.getNext().getElement()!=x)
	curr=curr.getNext();

	Node temp=curr.getNext();
	curr.setNext(curr.getNext().getNext());



	temp.setNext(head);
	head=temp;
	}

	//=======================================

	public void swapNode(int x,int y)
	{if(head==null||head.getNext()==null)
	    return;
	    Node temp1=head;
	    Node temp2=head;
	while((Integer)temp1.getNext().getElement()!=x)
	temp1=temp1.getNext();

	while((Integer)temp2.getNext().getElement()!=y)
	temp2=temp2.getNext();


	Node p1=temp1.getNext();
	Node p2=temp2.getNext();

	temp1.setNext(p1.getNext());
	temp2.setNext(p2.getNext());


	p2.setNext(temp1.getNext());
	temp1.setNext(p2);

	p1.setNext(temp2.getNext());
	temp2.setNext(p1);


	}       
	        
	//===========================================================

	void MergeSortedList(SinglyLinkedList A,SinglyLinkedList B)   
	 {
	 Node curA=A.head;
	 Node curB=B.head;
	 while(curA!=null&&curB!=null){
	 if((int)curA.getElement()< (int)curB.getElement())
	 {this.addLast((E)curA.getElement());
	 curA=curA.getNext();
	   }else
	 {
	 this.addLast((E)curB.getElement());
	 curB=curB.getNext();
	 }
	 }
	 while(curA!=null){
	 this.addLast((E)curA.getElement());
	 curA=curA.getNext();
	 }
	 while(curB!=null){
	 this.addLast((E)curB.getElement());
	 curB=curB.getNext();
	 }
	 }
	// //=================================
	// void partition(){
	//   Node cur=head;
	//   Node ptr=null;
	//   Node temp=new Node(null,null);
	//   while(cur.getNext()!=null){
//	     ptr=cur.getNext();
//	     while(ptr!=null)
//	     {if((int)cur.getElement()%2==0&&(int)ptr.getElement()%2==1)
//	     {temp.setElement(cur.getElement());
//	     cur.setElement(ptr.getElement());
//	     ptr.setElement(temp.getElement());
//	     break;
//	     }
//	     ptr=ptr.getNext();
//	     }
//	     cur=cur.getNext();
//	     
//	     }
	//   }
	 //====================================
	    SinglyLinkedList split(){
	    if(head==null||head.getNext()==null)
	        return null;
	    
	        Node temp=head;
	   
	   int num=size/2;
	   if(this.size()%2==1)
	       num++;
	          
	   for(int i=1;i<num;i++)
	    temp=temp.getNext();
	    
	   SinglyLinkedList lst=new SinglyLinkedList();
	    lst.head=temp.getNext();
	    temp.setNext(null);
	    return lst;
	    
	    }
	    
	  
	    //=========================================
	     public SinglyLinkedList MaxinPostion(SinglyLinkedList list1,SinglyLinkedList list2)
	     {if(list1.head==null||list2.head==null)
	         return null;
	     //===========================================
	     SinglyLinkedList temp=new SinglyLinkedList();
	     Node cur1=list1.head;
	     Node cur2=list2.head;
	     int number=0;
	     //============================================
	     
	     while(cur1!=null&&cur2!=null)    
	     {
	     if((int)cur1.getElement()>(int)cur2.getElement())
	     number=(int)cur1.getElement();
	     else
	         number=(int)cur2.getElement();
	     if(temp.head==null)
	     { temp.head=temp.tail=new Node(number,null);}
	     else
	     {
	     temp.tail .setNext(new Node(number,null));
	     temp.tail=temp.tail.getNext();
	     
	     }   
	     cur1=cur1.getNext();
	     cur2=cur2.getNext();
	     
	     }
	    //==================================================
	     if(cur1!=null)
	     {temp.tail.setNext(cur1);
	     temp.tail=temp.tail.getNext();
	     }
	     
	     if(cur2!=null)
	     {temp.tail.setNext(cur2);
	     temp.tail=temp.tail.getNext();
	     }
	     
	     
	     return temp;
	}
	     //=============================================
	     public SinglyLinkedList evenelements(int x){
	     if(x<=0||x>size)
	     return null;
	     SinglyLinkedList<Integer> temp=new SinglyLinkedList();
	     Node cur=head;
	      
	     while((Integer)head.getElement()%2==0)
	     {
	      if(temp.head==null)   
	                 temp.head=temp.tail=new Node(head.getElement(),null);
	              else
	              {  temp.tail.setNext(new Node(head.getElement(),null));
	              temp.tail=temp.tail.getNext();}
	               
	     head=head.getNext();
	     cur=head;
	     x--;
	     }
	     //========================================    
	    for(int i=1;i<x;i++)
	     {
	         
	             if((Integer)cur.getNext().getElement()%2==0)
	             {
	              if(temp.head==null)   
	                 temp.head=temp.tail=new Node(cur.getNext().getElement(),null);
	              else
	              {  temp.tail.setNext(new Node(cur.getNext().getElement(),null));
	              temp.tail=temp.tail.getNext();}
	              cur.setNext(cur.getNext().getNext());
	             }
	         else
	                 cur=cur.getNext();
	            
	     }
	     return temp;
	     
	}




	//=======================================================
	   
	  public void splitOddEven( SinglyLinkedList oddlist, SinglyLinkedList evenlist   ){
	  if(head==null)
	  return;
	  //==============================
	  Node cur=head;
	  
	  //==================================
	  while(cur!=null) { 
	  if((int)cur.getElement()%2==1)
	  {
	    if(oddlist.head==null)
	    {oddlist.head=new Node(cur.getElement(),null);
	    oddlist.tail=oddlist.head;
	         }
	    else
	    {
	      oddlist.tail.setNext(new Node(cur.getElement(),null));
	      oddlist.tail=oddlist.tail.getNext();
	           }
	       }
	  else
	  {
	   if(evenlist.head==null) {
	       evenlist.head=new Node(cur.getElement(),null);
	    evenlist.tail=evenlist.head;
	        }
	    else   {
	      evenlist.tail.setNext(new Node(cur.getElement(),null));
	      evenlist.tail=evenlist.tail.getNext();
	           }   
	         }
	     cur=cur.getNext();
	    }
	  }
	  //======================================
	  
	  public void add_sorted(int x)
	  {
	      Node n=null;
	  if(head==null)
	  {head=tail=new Node(x,null);
	  size++;
	   return;
	  }
	        if(x<(Integer)head.getElement())
	          head=new Node(x,head);
	  else
	      {
	          curr=head;
	  Node pr=head;
	  
	  while(curr != null &&(Integer) curr.getElement()< x) {
	         pr = curr;
	         curr = curr.getNext();
	  }
	     n=new Node(x,curr);
	     pr.setNext(n);
	     if(pr==tail)
	         tail=tail.getNext();
	      }
	  size++; 
	  }
}
	    
