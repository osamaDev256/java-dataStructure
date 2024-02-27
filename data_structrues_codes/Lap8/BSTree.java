package Lap8;

public class BSTree <K extends Comparable <K>, E> {
	private BSTNode<K, E> root; 
	  
	  
	   public void insert(K key, E data)
	{      BSTNode<K,E> parent = null; 
	       BSTNode<K,E> trav = root; 
	       while (trav != null) {
	    	   parent = trav;
		if (key .compareTo(trav.getKey())<0 )
			trav= trav.getLeft();
		else
	   	    trav = trav.getRight();  } 
	       
	        BSTNode<K,E> newNode = new BSTNode<K,E>(key, data); 
	        if (root == null)                  
	               root = newNode; 
	        else if (parent.getKey().compareTo(key)>0)       
	               parent.setLeft(newNode); 
	        else                                             
	               parent.setRight(newNode); 

	        
	}
	 
	   
	  public void print(){
	         
	      print(root)  ;
	  }
	  
	  private void print(BSTNode root){
	  if(root!=null)
	  {
	      print(root.getLeft());
	      
	     
	          
	      System.out.println(root.getData());
	      print(root.getRight());
	  }
	  
	  }
  
	  public boolean contains(E data) { 
	      
	     return search(root,(Integer)data); 	
	    			
	  }
	 
	   private  boolean search(BSTNode rt, Integer data) {
	        if(rt!=null)
	        {
	        if (rt.getData() == data) {
	           return true;
	        }
	       
	             return search(rt.getLeft(), data) || search(rt.getRight(), data);
	        }
	        return false;
	    }


	  public int GetleafCount() {
	        return getLeafCount(root);

	    }
	  
	    public int getLeafCount(BSTNode<K, E> node) {
	        if (node == null) 
	            return 0;
	        
	        if (node.getLeft() == null && node.getRight() == null) 
	            return 1;
	       
	            return getLeafCount(node.getLeft()) + getLeafCount(node.getRight());
	        
	    }
   
	     
	
	     public void print_(double g){
	     print_(root,g);
	     
	     }
	     private void print_(BSTNode root,Double g){
	  if(root!=null)
	  {
	      print_(root.getLeft(),g);
	      if((Double)((student)root.getData()).getExam_marks()>=g)
	          
	      System.out.println(root.getData());
	      print_(root.getRight(),g);
	  }
	  
	  }
}
