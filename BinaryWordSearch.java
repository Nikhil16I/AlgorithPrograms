package Algorithm_Programs;

import java.util.Arrays;

public class BinaryWordSearch {
	
	public static int binarySearch(String[] array ,String Word) {
		int First = 0 ; 
		int Last = array.length - 1;                  

		int Mid = (First+Last)/2;      
		
		if(Word.compareTo(array[Mid]) == 0) {
			return Mid;                                           
		}
		else if((Word.compareTo(array[Mid])) > 0) {
			First = Mid + 1;                                           
			return binarySearch(array, Word);
		}
		else if(Word.compareTo(array[Mid]) < 0) {
			Last = Mid - 1;                                             
			return binarySearch(array, Word);
		}
		else {
			return -1;
	}
}	
		public static void main(String[] args) {
			
	  String[] array = {"Apple","Samsung","Microsoft","IBM","HCL","Intel","Lenovo","Dell","Amazon"};
	  
	     	String SearchWord="HCL";
			int Index = binarySearch(array , SearchWord);
			
			if(Index == -1) {
				System.out.println("The word " + SearchWord + " is not in the Array");
			}
			else {
				System.out.println("The Word " + SearchWord + " is found in the Array");
				System.out.println("Index Positin of the Word is at "+Index);
			}
		}
}

