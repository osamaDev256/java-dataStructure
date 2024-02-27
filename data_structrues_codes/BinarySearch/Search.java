package BinarySearch;

public class Search {
	
	public static boolean  binarySearch(int[ ] data, int target, int low, int high) { 
			 if (low > high)
				 return false;					 // interval empty; no match
			 else {
		  		int mid = (low + high) / 2;
		  		System.out.println(data[mid]);
				 if (target == data[mid])
		 			return true;				 // found a match
		 		else if (target < data[mid])
		 			return binarySearch(data, target, low, mid-1);	 // recur left of the middle
		 		else
					 return binarySearch(data, target, mid+1, high);	 // recur right of the middle
			
			 }
		  }
	
	public static void main(String[] args) {
		int arr[] = {80 , 73 , 65 , 58 , 40 , 24 , 15 , 10};
		System.out.println(binarySearch(arr, 15, 0, 7));
		
	}
}
