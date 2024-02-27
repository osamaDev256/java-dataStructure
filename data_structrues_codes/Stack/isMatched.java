package Stack;

public class isMatched {
	
		// very important !!!!!!!!
		public static boolean isMatch(String expression){
		    final String opening="({[";
		    final String closing=")}]";
		    
		   ArrayStack<Character>buffer=new ArrayStack<>();
		   
		    for(char c:expression.toCharArray()){
		    if(opening.indexOf(c)!=-1)
		        buffer.push(c);
		    else if(closing.indexOf(c)!=-1){
		        if(buffer.isEmpty())
		            return false;
		        if(closing.indexOf(c)!=opening.indexOf(buffer.pop()))
		            return false;
		    }
		    }
		    return buffer.isEmpty();
		}
		public static void main(String[] args) {
			String s = "({[]})";
			System.out.println(isMatch(s));
		}
	}


