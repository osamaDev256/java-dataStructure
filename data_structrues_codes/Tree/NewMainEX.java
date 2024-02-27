package Tree;

public class NewMainEX {
	
		
	public static <E> void preOrder(BTNode<E> p) {
        if (p == null) {
            return;
        }
        System.out.print(" "+p.getItem());
        preOrder(p.getLeft());
        preOrder(p.getRight());

    }
    //=================

    //=================
    public static int sum(BTNode node) {
        if (node == null) {
            return 0;
        }
        return (Integer) node.getItem() + sum(node.getLeft()) + sum(node.getRight());
    }

// 
    public static boolean isSumTree(BTNode node) {
        Integer ls, rs;

        if (node == null) {
            return true;
        }
        //if(node.isLeaf())
        if (node.getLeft() == null && node.getRight() == null) 
            return true;
        

        ls = sum(node.getLeft());
        rs = sum(node.getRight());

        if (((Integer) node.getItem() == ls + rs) && (isSumTree(node.getLeft()) == true)
                && (isSumTree(node.getRight())) == true) {
            return true;
        }
        return false;
    }
    //============================================

    public static void leafDelete(BTNode root) {
        if (root == null) {
            return;
        }
        if (root.getLeft() != null) {
            if (root.getLeft().getLeft() == null && root.getLeft().getRight() == null) {
                root.setLeft(null);
            }
        }

        leafDelete(root.getLeft());

        if (root.getRight() != null) {
            if (root.getRight().getLeft() == null && root.getRight().getRight() == null) {
                root.setRight(null);
            }
        }
        leafDelete(root.getRight());
    }
    //============================================

//    public static int sumOdd(BTNode node) {
//
//        if (node == null) {
//            return 0;
//        }
//        if ((int) node.getItem() % 2 == 1) {
//            return (int) node.getItem() + sumOdd(node.getLeft()) + sumOdd(node.getRight());
//        } else {
//            return sumOdd(node.getLeft()) + sumOdd(node.getRight());
//        }
//
//    }
    
    static int sumtion=0;
    public static int sumOdd(BTNode node) {

        if (node == null) {
            return 0;
        }
        if ((int) node.getItem() % 2 == 1) 
            sumtion+=(int)node.getItem();
           
             sumOdd(node.getLeft());
             sumOdd(node.getRight());
        
return sumtion;
    }
    //===========================================

//    static int CountEvenOccu(BTNode root) {
//        int count = 0;
//        if (root == null) {
//            return 0;
//        }
//
//        if ((Integer) root.getItem() % 2 == 0) {
//            count++;
//        }
//
//        return count + CountEvenOccu(root.getLeft()) + CountEvenOccu(root.getRight());
//
//    }
//============================================
    static int count=0;
static int CountEvenOccu(BTNode root) {
       
        if (root == null) {
            return 0;
        }

        if ((Integer) root.getItem() % 2 == 0) {
            count++;
        }
  CountEvenOccu(root.getLeft()) ;
  CountEvenOccu(root.getRight());
        return count;

    }

	
//================================================

public boolean isExternal(BTNode p){
if (p != null)
if (p.getLeft() == null && p.getRight() == null)
return true;
return false;
}


//=================================


public  static void mirrorTree(BTNode   root) {
		if(root == null) {
			return;
		}
          BTNode  swapNode = root.getLeft();
		root.setLeft(root.getRight()); 
		root.setRight(swapNode);
              
              
              
		mirrorTree(root.getLeft());
		mirrorTree(root.getRight());
             		
	}




  
  
  //==================================
public static boolean isproperTree(BTNode node) 
  { 
    
      if(node == null) 
      return true; 
                 
      if(node.getLeft() == null && node.getRight() == null ) 
          return true; 
                 
      if(node.getLeft()!=null && node.getRight()!=null) 
          return (isproperTree(node.getLeft()) && isproperTree(node.getRight())); 
         
      // if none work 
      return false; 
  }

//=========================================

static int max = Integer.MIN_VALUE;
////================================================

static int findMax(BTNode node) {
   if (node == null) {
       return 0;
   }

   if ((int) node.getItem() > max) {
       max = (int) node.getItem();
   }

   findMax(node.getLeft());
   findMax(node.getRight());

   return max;
}
//=================================
static int min = Integer.MAX_VALUE;
////================================================

static int findMin(BTNode node) {
   if (node == null) {
       return 0;
   }

   if ((int) node.getItem() < min) {
       min = (int) node.getItem();
   }

   findMin(node.getLeft());
   findMin(node.getRight());

   return min;
}
//============================================================
public static boolean search(BTNode rt, Integer k) {
   if(rt!=null)
   {
   if (rt.getItem() == k) {
      return true;
   }

   return search(rt.getLeft(), k) || search(rt.getRight(), k);
   }
   return false;
}
//===================================================================================            
public static boolean ifFoundInLeafe(BTNode root, Integer k) {
 if(root!=null){

   if (root.getItem() == k) {
     if(root.getLeft()==null&&root.getRight()==null)

       return true;
   }

   return ifFoundInLeafe(root.getLeft(), k) || ifFoundInLeafe(root.getRight(), k);
 }
 return false;
}


//===================================
public static void printParentX(BTNode root,int x) {

if(root!=null)
{
  if((int)root.getItem()==x)
      return ;
  
 if(root.getLeft()!=null&&(int)root.getLeft().getItem()==x)
  System.out.println(root.getItem());
  
  if(root.getRight()!=null&&(int)root.getRight().getItem()==x)
  System.out.println(root.getItem());
  
printParentX(root.getLeft(),x);
printParentX(root.getRight(),x);

}
}

    //======================================
    public static void main(String[] args) {
        BTNode<Integer> root = new BTNode();
        root.setItem(26);
        BTNode<Integer> L = new BTNode();
        L.setItem(10);
        BTNode<Integer> R = new BTNode();
        R.setItem(3);
        BTNode<Integer> LL = new BTNode();
        LL.setItem(4);
        BTNode<Integer> RR = new BTNode();
        RR.setItem(6);
        root.setLeft(L);
        root.setRight(R);
        L.setLeft(LL);
        L.setRight(RR);
        BTNode<Integer> x = new BTNode();
        x.setItem(2);
        R.setLeft(x);
        BTNode<Integer> y = new BTNode();
        y.setItem(1);
        R.setRight(y);
        //=================
//        System.out.println(isSumTree(root));
//
//        preOrder(root);
//       System.out.println("\n========");
//       leafDelete(root);
//        preOrder(root);
        System.out.println(sumOdd(root));
        System.out.println(CountEvenOccu(root));
    }

}
