package Algorithm_Programs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageCustomization {
	
		String name ="<<name>>";
		String mobileNumber="xxxxxxxxxx";
		String fullName ="<<full name>>";
		String date ="01/01/2016";
		
		String message;
		public void FirstName(String input) {
			Pattern pattern = Pattern.compile(name);
			Matcher matcher = pattern.matcher(input);
			message = matcher.replaceAll("Nikhil");
		}
		public void FullName(String input) {	
			Pattern pattern = Pattern.compile(fullName);
			Matcher matcher = pattern.matcher(message);
			message = matcher.replaceAll("Nikhil Patil");	
		}
		public void PhoneNumber(String input) {	
			Pattern pattern = Pattern.compile(mobileNumber);
			Matcher matcher = pattern.matcher(message);
			message = matcher.replaceAll("9998885556");
		}	
		public void Date(String input) {
			DateTimeFormatter presentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDateTime localDate = LocalDateTime.now();
			
			Pattern pattern = Pattern.compile(date);
			Matcher matcher = pattern.matcher(message);
			message = matcher.replaceAll(presentDate.format(localDate));
		}
		
		public void Display() {
			System.out.println(message);
		}
		
		public static void main(String[] args) {
			MessageCustomization customize = new MessageCustomization();
			String input = "Hello <<name>>, We have your fullname as <<full name>> in our system. your contact number is 91-xxxxxxxxxx."
							+"\nPlease,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";//According To Question
			customize.FirstName(input);
			customize.FullName(input);
			customize.PhoneNumber(input);
			customize.Date(input);
			customize.Display();
		}
	}


