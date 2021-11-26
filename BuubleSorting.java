package Algorithm_Programs;

public class BuubleSorting {

	public int[] Buubblesort(int[]Array) {
		for(int i =0;i<Array.length;i++) {
		for(int j=0;j< Array.length-1;j++) {
			if(Array[j]>Array[j+1]) {
				
				int J =Array[j];
				Array[j]=Array[j+1];
				Array[j+1]=J;
			}
		}
	}
		return Array;
}
	public void PrintSorted(int Array[]) {
	for(int i=0;i<Array.length;i++) { 
		System.out.println(Array[i]);
	}
 }
	public static void main(String[] args) {
		BuubleSorting sort =new BuubleSorting();
		int[] Array= {99,98,97,96,95,94,92,64};
		sort.Buubblesort(Array);
		System.out.println("Sorted elements in Array");
		sort.PrintSorted(Array);
	}
}
