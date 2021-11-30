package Algorithm_Programs;

	import java.util.ArrayList;
	import java.util.Arrays;

	public class PalindromandAnagram {
		static ArrayList<Integer> ArrayList = new ArrayList<Integer>();

		 public static void Primenumber(){		
		       int i =0;
		       int num =0;
		       String  primeNumbers = "";

		       for (i = 1; i <= 1000; i++){ 		  	  
		          int counter=0; 	  
		          for(num =i; num>=1; num--){
		             if(i%num==0){
		 		counter = counter + 1;
			     }
			  }
			  if (counter ==2){
				  ArrayList.add(i);
				  primeNumbers = primeNumbers + i + " ";
			  }	
		    }	
		       //System.out.println("Prime numbers from 1 to 1000 are - ");
		       //System.out.println("Prime Number - "+primeNumbers);
		}
		
		public static void PalidromPrime() {
			Primenumber();
			
			for(int i = 0; i < ArrayList.size(); i++) {
				int Number = ArrayList.get(i);int Reamainder = 0;
				int RevNum = 0;int temp = Number;

                 while(Number > 0) {
					Reamainder = Number % 10;           
					Number = Number / 10;       
					RevNum = RevNum * 10 + Reamainder;  
				}
				if(temp == RevNum) {
			System.out.print(RevNum+" ");     
				}
				else {
					continue;
				}
			  }
		    }
		public static void AnagramD() {
			Primenumber();
			
          for(int i= 0; i< ArrayList.size(); i++) { 
				int First =ArrayList.get(i);
				String String1 = Integer.toString(First);				
          
          for(int j= i+1; j< ArrayList.size(); j++) { 
				int Second =ArrayList.get(j);				
				String String2 = Integer.toString(Second);
				 
		  if(String1.length() == String2.length()) {
		       char[] ArrayCh1 = String1.toCharArray();
		       char[] Arraych2 = String2.toCharArray();
		        	  
		        Arrays.sort(ArrayCh1);
		        Arrays.sort(Arraych2);
		       boolean AnagramResult = Arrays.equals(ArrayCh1, Arraych2);
		   if(AnagramResult) {
		         System.out.println(String1+" & "+String2);
		         System.out.println(" -These two Prime Words Are Anagram");
		   }else {
		         //System.out.println(String1+" & "+String2);
		        //System.out.println(" -These two Words aren't Anagram");
		        continue;
		      }
           }
		  
           }	
	    }
	 }
	
      public static void printArrayList() {
	     	Primenumber();                          
		for(Integer Prime : ArrayList) {
			System.out.print(Prime+" ");
		}
	}
		public static void main(String[] args) {
			
		System.out.println("Palindromic Primes Are -");
			PalindromandAnagram.PalidromPrime();    			
		System.out.println(" ");			
		System.out.println("Prime and Anagram Are -");
			PalindromandAnagram.AnagramD();
		}
	}

