package Tree;

public class SlidesEX {
	
	public static <E> void preOrder(BTNode<E> p) {
		if (p == null) 
		    return;
		  System.out.println(p.getItem());
		  preOrder(p.getLeft());
		  preOrder(p.getRight());

		}
		     
//		     public static int calculateSum(BTNode root)  
//		    { 
//		        if (root == null) 
//		            return 0; 
//		      
//		     return (int )root.getItem() + calculateSum(root.getLeft()) + calculateSum(root.getRight()); 
//		    } 
		     
		     
		     
		     
		     
		     
		static int sum=0;
		//====================================================
		public static int calculateSum(BTNode root)  
		    { 
		        if (root == null) 
		            return 0; 
		       sum+=(int)root.getItem();
		       
		        calculateSum(  root.getLeft());
		         calculateSum(root.getRight()); 
		         return sum;
		    }
		

		//========================================
		  
		  public static <E>  int countOccurrence (BTNode<E> root, E num )
		{ 
			 int count=0;
			if(root == null)	
				return 0;
			if(root.getItem() == num)		
				count++;
		        
				 countOccurrence( root.getLeft(), num);
		         countOccurrence( root.getRight(), num);
		         return count;
		}

		//==================================================================


		public static void noSipling(BTNode<Integer>root) { 
		   
		   if(root!=null) {
		         
		      if(root.getLeft() != null && root.getRight() == null)
		             System.out.println(root.getLeft().getItem());
		   
		       if(root.getLeft() == null && root.getRight() != null)
		         System.out.println(root.getRight().getItem());
		       
		   noSipling(root.getLeft());
		  
		   noSipling(root.getRight());
		       }
		   }   
		 
		  //=============================================
		 
		 public static void printAllRootToLeafPaths(BTNode root, String path) { 
		if(root != null){
		     path += root.getItem()+"," ;
		        
		         if (root.getLeft() == null && root.getRight() == null) { 
		         System.out.println(path);
		        
		    
		            }
		        printAllRootToLeafPaths(root.getLeft(), path);
		        printAllRootToLeafPaths(root.getRight(), path);
		          
		}
		}
		 //=============================================
		 
		 public static int sum(BTNode node) {
		        if (node == null) 
		            return 0;
		       
		        return (Integer) node.getItem() + sum(node.getLeft()) + sum(node.getRight());
		    }
		//========================================================
		    public static int Countnode(BTNode root) {
		        if (root == null) {
		            return 0;
		        }

		        return 1 + Countnode(root.getLeft()) + Countnode(root.getRight());
		    }
		//==================================================================
		    public static int getLeafCount(BTNode root) {
		        if (root == null) {
		            return 0;
		        }
		        if (root.getLeft() == null && root.getRight() == null) 
		            return 1;
		        
		            return getLeafCount(root.getLeft()) + getLeafCount(root.getRight());
		        }
		    

		//==============================================
		    public static int getparentCount(BTNode root) {
		        if (root == null) {
		            return 0;
		        }
		        if (root.getLeft() == null && root.getRight() == null) 
		            return 0;
		       
		        
		      
		            return  1 + getparentCount(root.getLeft()) + getparentCount(root.getRight());
		        }
		   


		    public static void main(String[] args) {
		        BTNode<Integer> root=new BTNode<Integer>();
				BTNode<Integer> l1=new BTNode<Integer>();
				BTNode<Integer> r1=new BTNode<Integer>();
				BTNode<Integer> l2=new BTNode<Integer>();
				BTNode<Integer> r2=new BTNode<Integer>();
				BTNode<Integer> r3=new BTNode<Integer>();
				root.setItem(5);
				l1.setItem(6);
				r1.setItem(7);
				l2.setItem(8);
				r2.setItem(9);
				r3.setItem(2);
				root.setLeft(l1);
				root.setRight(r1);
				l1.setLeft(l2); 
				l1.setRight(r2);
				r1.setRight(r3);
				
		        preOrder(root);
		        System.out.println("-------");
//		        System.out.println("\n"+calculateSum(root));
//		        System.out.println(countOccurrence(root, 8));
		        noSipling(root);
		        
		        
		        
//		        System.out.println("\n"+countOccurrence(root, 9));
		        String s="";
		       printAllRootToLeafPaths(root,  s);
		       
		       
		       /*
		        BTNode<Integer> root = new BTNode<Integer>();
		        BTNode<Integer> l1 = new BTNode<Integer>();
		        BTNode<Integer> r1 = new BTNode<Integer>();
		        BTNode<Integer> l2 = new BTNode<Integer>();
		        BTNode<Integer> r2 = new BTNode<Integer>();
		        BTNode<Integer> r3 = new BTNode<Integer>();
		        root.setItem(5);
		        l1.setItem(6);
		        r1.setItem(7);
		        l2.setItem(8);
		        r2.setItem(9);
		        r3.setItem(2);
		
		        root.setLeft(l1);
		        root.setRight(r1);
		        l1.setLeft(l2);
		        l1.setRight(r2);
		        r1.setRight(r3);
		//
		        preorder(root);
		//===============================
		        System.out.println("====================");
		        System.out.println("sum " + sum(root));
		        System.out.println("count " + Countnode(root));
		        System.out.println("leave count " + getLeafCount(root));
		        System.out.println("parent count " + getparentCount(root));
			 
		        */
		    }
}
