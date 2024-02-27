package Tree;

public class ExpressionMan {
	
	 public static int evalExpression(BTNode<Character> p) {
	  if(p==null)
	      return 0;
	     
	   if(p.getLeft()==null&&p.getRight()==null)   
	      return Character.getNumericValue(p.getItem());
	   
	      int x = evalExpression(p.getLeft());
	      int y = evalExpression(p.getRight());
	     
	        switch(p.getItem()){
	            case '+':  
	            return x+y;
	              case '-':  
	            return x-y;
	                  case '*':  
	            return x*y;
	                      case '/':  
	            return x/y;
	                          case '%':  
	            return x%y;
	                   }
	    
	 
	  return 0;
	  
	  }
	  //========================================
	  
	  public static void printInfixExpression(BTNode<Character>root) {
	    if (root == null)
	    return;
	       if (root.getLeft() != null && root.getRight() != null)   
	            System.out.print ("(");
	        
	        printInfixExpression(root.getLeft());
	        System.out.print(root.getItem());
	        printInfixExpression(root.getRight());
	        
	        if (root.getLeft() != null && root.getRight() != null)   
	            System.out.print (")");
	        
	  }
	  //=============================================
	    public static void main(String[] args) {

			BTNode<Character>root=new BTNode();
			root.setItem('+');
			 BTNode<Character>L=new BTNode();
			L.setItem('5');
		
			BTNode<Character>R=new BTNode();
			R.setItem('*');
			BTNode<Character>LL=new BTNode();
			LL.setItem('3');
			BTNode<Character>RR=new BTNode();
			RR.setItem('2');
			root.setLeft(L);
			root.setRight(R);
			R.setLeft(LL);
			R.setRight(RR);
		
			printInfixExpression(root);
	        //System.out.println(evalExpression(root));    
	        }
}
