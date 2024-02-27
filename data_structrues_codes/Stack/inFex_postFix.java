package Stack;

public class inFex_postFix {
	static int Prec(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
      
        case '*':
        case '/':
            return 2;
      
        case '^':
            return 3;
        }
        return -1;
    }
      
    
    public static String infixToPostfix(String exp)
    {
        
        String result = new String("");
         
       
        ArrayStack<Character> stack = new ArrayStack<>();
         
        for (int i = 0; i<exp.length(); i++)
        {
            char c = exp.charAt(i);
             
           
            if (Character.isLetterOrDigit(c))
                result += c;
              
            
            else if (c == '(')
                stack.push(c);
             
            
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.top() != '(')
                    
                    result += stack.pop();
                 
                
                    stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c)<= Prec(stack.top())){
                   
                    result += stack.pop();
             }
                stack.push(c);
            }
      
        }
              
        while (!stack.isEmpty()){
            if(stack.top() == '(')
                return "Invalid Expression";
            result += stack.pop();
         }
        return result;
    }
    
    
    
    
   //=====================================================
   public static int postfix(String expression) {
        
  LinkedStack<Integer> temp=new LinkedStack<Integer>();
  
  for(int i = 0; i < expression.length(); i++) {
  
    int x=0,y=0;
    if(Character.isDigit(expression.charAt(i)) )
      temp.push(Integer.parseInt(String.valueOf(expression.charAt(i)) ));
                else
                {
	                 x=temp.pop();
	                 y=temp.pop();
	                switch(expression.charAt(i)){
	                    case  '+':
	                    	temp.push((y + x));
	                    	break;
	                    case '-':
	                    	temp.push((y - x));
	                    	break;
	                    case  '*':
	                    	temp.push((y*x));
	                    	break;
	                    case '/':
	                    	temp.push((y / x));
	                   break;
	              
	  }
	        }
	        }
  return temp.pop();

}   
    
    
    //=====================================================
    
    public static void main(String[] args)
    {
         
        String s1 = "6+1^5-8*4";
        String exr="78+32+/";
         System.out.println(postfix(exr));
       //System.out.println(infixToPostfix(s1));
//        String exp = "6+5*3-5";
//        System.out.println(infixToPostfix(exp));
    }

}
