package Queue;

public class Tutorial {
	
	public static boolean isPalindrome (String s){
		if(s.length()==0)
			 return true;
		 
		 ArrayQueue<Character> Q = new ArrayQueue<Character>(s.length());
		 int i = s.length()-1;
		 
		 while(i>=0) 
		 Q.enqueue(s.charAt(i--));
		 i = 0;
		 while(!Q.isEmpty())
		 if(Q.dequeue()!=s.charAt(i++)) 
		 return false;
		 return true;
		}
	
	//=============================
	public static String Compress (String Str) {
		LinkedQueue<Character> Q = new LinkedQueue<Character>();
		for (int i=0; i< Str.length(); i++)
		if (Str.charAt(i) != ' ' )
		Q.enqueue(Str.charAt(i));
		String tmp = "";
		while (!Q.isEmpty())
		tmp = tmp+ Q.dequeue();
		return tmp;
		}

	
	public static void main(String[] args) {
		String t = "ya ay";
		System.out.println(isPalindrome(t));
		System.out.println(Compress(t));
	}
}
