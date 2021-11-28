package Algorithm_Programs;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetectionEx {	
	public static void AnagramD(String FirstWord , String SecondWord) {
		
		FirstWord = FirstWord.toLowerCase();
		SecondWord = SecondWord.toLowerCase();
		
	 if(FirstWord.length() == SecondWord.length()) {
		char[] ArrayCh1 = FirstWord.toCharArray();
		char[] Arraych2 = SecondWord.toCharArray();
			
		Arrays.sort(ArrayCh1);
		Arrays.sort(Arraych2);
		boolean AnagramResult = Arrays.equals(ArrayCh1, Arraych2);
		 if(AnagramResult) {
			 System.out.println(FirstWord+" & "+SecondWord);
			System.out.println(" -These two Words Are Anagram");
		 }else {
			 System.out.println(FirstWord+" & "+SecondWord);
		    System.out.println(" -These two Words aren't Anagram");
		}
	  }
	}
	public static void main(String[] args) {
	 	Scanner Input = new Scanner(System.in);
	 	
		System.out.print("Enter First Word - ");
		String FirstWord = Input.nextLine();		
		System.out.print("Enter Second Word - ");
		String SecondWord = Input.nextLine();
		
	AnagramDetectionEx Anagram = new AnagramDetectionEx();
	Anagram.AnagramD(FirstWord,SecondWord);
	}
}
