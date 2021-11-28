package Algorithm_Programs;

public class InsertionSorting {

public void InsertionSort(int[] Array) {
	
	for(int i=0;i < Array.length;i++) {
		
		int Insert = Array[i];
		int newposn =i-1;
		
	 while (newposn > 0 && Array[newposn] > Insert) {
		 Array[newposn+1]=Array[newposn];
		 newposn =newposn-1;		 
	 }
	 Array[newposn+1]=Insert;
	}
 }
      public void PrintSorted(int Array[]) {
	      for(int i=0;i<Array.length;i++) { 
		 System.out.println(Array[i]);
	}	
  }
      public static void main(String[] args) {
    	  InsertionSorting sort =new InsertionSorting();
		int[] Array = {99,98,97,96,95,94,92,64};
		System.out.println("Sorted elements in Array By Insertion sorting are-");
		sort.PrintSorted(Array);

	}
}
