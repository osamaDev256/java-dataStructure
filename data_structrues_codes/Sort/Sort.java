package Sort;

public class Sort {
	
	public static void bubbleSort(int []a) {
		
		for(int i = 0 ; i < a.length - 1 ; i++) {
			
			for(int j = 1 ; j < a.length - i ; j++) {
				
				if(a[j - 1] > a[j]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp ;
				}
			}
		}
	}
	//===============================================
	public static void insertionSort(int[] a) {
	    for (int i = 1; i < a.length; i++) {
	        int temp = a[i];

	        // slide elements down to make room for a[i]
	        int j = i;
	        while (j > 0 && a[j - 1] > temp) {
	            a[j] = a[j - 1];
	            j--;
	        }

	        a[j] = temp;
	    }
	}
	//=================================================
	public static void selectionSort(int[] a) {
		
	    for (int i = 0; i < a.length; i++) {
	        // find index of smallest element
	        int minIndex = i;
	        for (int j = i + 1; j < a.length; j++) {
	            if (a[j] < a[minIndex]) {
	                minIndex = j;
	            }
	        }

	        // swap smallest element with a[i]
	        int temp = a[i];
	        a[i] = a[minIndex];
	        a[minIndex] = temp ;
	    }
	}
	
	//====================================================
	public static void Selectionsort_SLL() {
	    Node current = head.next;
	    for (int i = 0; i < size()-1; i++) {
	        Node min = current;
	        Node nxt = current.getNext();
	        for (int j = i + 1; j < size(); j++) {
	        if ((int) min.getElement() > (int) nxt.getElement())
	        min = nxt;
	        nxt = nxt.getNext();
	        }
	        int x = (int) current.getElement();
	        current.setElement((E) min.getElement());
	        min.setElement(x);
	        current = current.getNext();
	    }
	    
	}
//	
	//=====================================================
	
	public  void insertionSorT_DLL(){
		
	      Node temp=header.next;
	      
			for(int i = 1 ; i < size ; i++){
			  temp=temp.next;
			  int num=(int)temp.element;
			  
			  Node j=temp; 
			while(j != header.next &&(int) j.prev.element>num)
			{
			    j.element=j.prev.element;
			    j=j.prev;
			    }
			//
			j.element=num;
			//
			//
			}
			}


	//=================================================
	public static void main(String[] args) {
		int []arr = {22,11,34,-5,3,40,9,16,6};
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
