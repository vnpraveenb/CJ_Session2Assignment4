import java.util.Scanner;

public class TestDemo {

	
	//Converts any string into the Ascii Codes
	public static void asciiCode(String s1)
	{
		for(int i=0;i<s1.length();i++)
		{
			System.out.print((int)s1.charAt(i));
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Input a number to check  if it is Positive or Negative or Zero along with the  ASCII value");
		
		System.out.println("Please input the number: ");
 		 
		Scanner scan = new Scanner(System.in);
		
		// Stores the value of the number for which the checking needs to be done
		int num = scan.nextInt(); 
		
		// The value in num is converted to String and stored in s1
		String s1=  String.valueOf(num); 
		 
		//Evaluating if the number is positive, negative or Zero using if-else if
		if(num>0)
		{ 
			System.out.print("\"You Have Entered a Positive Value\" and its ASCII Code is: ");
 			asciiCode(s1);
		}
		else if  (num<0)
			{
				System.out.println("\"You Have a Entered Negative Value\" and its  ASCII Code is: ");
				asciiCode(s1);
			} 
			else 
			{
				System.out.println("\"You Have a Entered Zero\" and its ASCII Code is: ");
				asciiCode(s1);
			}
	}
	
	
}
