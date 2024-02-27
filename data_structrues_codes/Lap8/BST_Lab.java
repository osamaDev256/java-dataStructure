package Lap8;

public class BST_Lab {
	
	public static void main(String[] args) {
        BSTree<Integer, Integer> t = new BSTree();
        t.insert(5, 5);
        t.insert(8, 8);
        t.insert(1, 1);
        t.insert(7, 7);
        t.insert(3, 13);
        t.insert(9, 9);
        t.insert(4, 4);
        t.insert(12, 14);
        t.insert(3, 3);
        System.out.println("value found ? "+t.contains(3));
        System.out.println("number of leaf nodes "+t.GetleafCount());

        //==========================================================
        
        BSTree<Integer,student> b = new BSTree();
    	b.insert(5, new student(5,"osama",88));
    	b.insert(3, new student(3,"saleh",75));
    	b.insert(8, new student(8,"basil",98));
    	b.insert(3, new student(9,"abdulaziz",71));

    		System.out.println();
    		b.print();
    		System.out.println();
        

        
    }


}
