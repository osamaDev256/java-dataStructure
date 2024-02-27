package BST;

public class BinarySearchTree <K, E>{
	 private BSTNode<K, E> root; 
		
	
	public int Sum() {
        return sum(root);

    }

    private int sum(BSTNode node) {
        if (node == null) {
            return 0;
        }
        return (Integer) node.getData() + sum(node.getLeft()) + sum(node.getRight());
    }
//=========================================================
    public int CountNodes() {
        return Countnode(root);

    }

    int Countnode(BSTNode<K, E> node) {
        if (node == null) {
            return 0;
        }

        return 1 + Countnode(node.getLeft()) + Countnode(node.getRight());
    }

    //=================================================
    public int GetleafCount() {
        return getLeafCount(root);

    }
    int getLeafCount(BSTNode<K, E> node) {
        if (node == null) 
            return 0;
        
        if (node.getLeft() == null && node.getRight() == null) 
            return 1;
       
            return getLeafCount(node.getLeft()) + getLeafCount(node.getRight());
        
    }

//==============================================
    public int GetparentCount() {
        return getparentCount(root);

    }

    int getparentCount(BSTNode<K, E> node) {
        if (node == null)
            return 0;
       
        if (node.getLeft() == null && node.getRight() == null) 
            return 0;
       
            return 1 + getparentCount(node.getLeft()) + getparentCount(node.getRight());
       
    }
	
	
	
	
	
	
	 public static void main(String[] args) {
	        BSTree<Integer,employee>tr=new BSTree();
	    
	         employee emp1=new employee(3,"lolo",9000);
	         employee emp2=new employee(1,"fofo",7000);
	         employee emp3=new employee(4,"toto",10000);
	         employee emp4=new employee(2,"dodo",8000);
	                  
	        tr.insert(3, emp1);
	        tr.insert(1, emp2);
	        tr.insert(4, emp3);
	        tr.insert(2, emp4);
	        
	      // tr.print();       
	        System.out.println(tr.search(4)); 
//	        System.out.println(tr.Search(3));
//	        System.out.println("==========");
//	        tr.print();
	        
	        /*
	         *  BSTree<Integer, Integer> myt = new BSTree();
			        myt.insert(20, 20);
			        myt.insert(15, 15);
			        myt.insert(40, 40);
			        myt.insert(5, 5);
			        myt.insert(17, 17);
			        myt.insert(30, 30);
			        myt.insert(45, 45);
			      	myt.insert(1, 1);
                     //===================================
 					System.out.println(myt.Sum()); 
			        System.out.println("tree size " + myt.CountNodes());
			        System.out.println("leave count " + myt.GetleafCount());
			        System.out.println("parent count " + myt.GetparentCount());
	         */
	    }
}
