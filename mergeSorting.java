package Algorithm_Programs;

public class mergeSorting {
	
	public void mergeing(int [] Array, int First, int Mid, int Last) {
		
		int [] HalfLeft = new int[Mid - First + 1];		
		int [] HalfRight = new int[Last - Mid];
			
    for(int i = 0; i < Mid - First + 1; i++)
    	HalfLeft[i] = Array[First + i];
    
	for(int j = 0; j < Last - Mid; j++) 
		HalfRight[j] = Array[Mid + j + 1];
	
		int K = First;
		int i = 0, j = 0;
		
	  while (i < HalfLeft.length && j < HalfRight.length) {
		if(HalfLeft[i] < HalfRight[j]) {
		   Array[K] = HalfLeft[i];				
            i++;	
		}
		else {  
		    Array[K] = HalfRight[j];
			j++;
	 }
		K++;
   }			  	  
		while( i < HalfLeft.length) {
		    Array[K] = HalfLeft[i];
		K++; i++;
	}		
		while( j < HalfRight.length) {
			Array[K] = HalfRight[j];
		K++; j++;		
	}
}	
public void sorting(int [] Array, int First, int Last) {
		
		if(Last - First < 1) {
		
		int Mid = (Last + First) / 2;	
		
		sorting(Array, First, Mid);
		sorting(Array, Mid + 1, Last);
		
		 mergeing(Array, First, Mid, Last);
	}
 }
public void PrintSorted(int Array[]) {
    for(int i=0;i<Array.length;i++) { 
	 System.out.println(Array[i]);
    }
 }
public static void main(String[] args) {
	mergeSorting sort =new mergeSorting();
	int[] Array = {99,98,97,96,95,94,92,64};
	System.out.println("Merge Sorting");
	System.out.println("Sorted elements are-");
	sort.sorting(Array, 0, Array.length-1);
	sort.PrintSorted(Array);

   }
}


