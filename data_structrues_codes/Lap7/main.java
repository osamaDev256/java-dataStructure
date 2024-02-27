package Lap7;

public class main {
	public static void main(String[] args) {     
     // 3
     ExpressionTree tree = new ExpressionTree();

     String postfix = "56+34*3*+";

     char[] charArray = postfix.toCharArray();

     tree.construct_PostExpretionTree(charArray);
     System.out.println("\npostfix expression is : ");

    
     System.out.println();
     tree.inorder(tree.root);
     System.out.println();
     tree.preorder(tree.root);
     System.out.println();

     tree.postorder(tree.root);
     System.out.println();
     System.out.println(tree.evalExpression(tree.getRoot()));

     tree.construct_infixExpretionTree("(((6+5)*4)+(3-(2/1)))");
           System.out.println("\ninfix expression is : ");
           System.out.println();
           tree.inorder(tree.root);

		
		
//tree.inorderPrintTree(tree.root);
//     System.out.println("=====");
//tree.preorderPrintTree(tree.root);
//     System.out.println("====");
//    tree.postorderPrintTree(tree.getRoot(), 0);
		
		
		
		
//		 BinaryTree<Integer> bt = new BinaryTree();
//	     System.out.println(bt.getSize());
//	     TreeNode<Integer> r = bt.addRoot(5);
//	     TreeNode<Integer> lc = bt.addLeft(r, 8);
//	     TreeNode<Integer> rc = bt.addRight(r, 9);
//	     System.out.println(bt.isRoot(r));
//	     System.out.println(bt.isRoot(lc));
//	     System.out.println(lc.getItem());
//	     System.out.println(bt.isEmpty());
//	     System.out.println(bt.isExternal(rc));
//	     System.out.println(bt.isInternal(lc));
//	     bt.addLeft(lc, 100);
//	     bt.addLeft(rc, 300);
//	     System.out.println(bt.getSize());
//	     System.out.println(bt.left(lc).getItem() + 30);
//
//
//	     System.out.println("Height " + bt.height());
//	     bt.breadth_first(r);
//
// }

	}
}

	

