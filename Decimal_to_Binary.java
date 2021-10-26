// Scanner class is used for taking input from user
import java.util.Scanner;

class DecimalToBinaryConversionClass{
	public static void main(String[] args){
		// create Scanner class object 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Any Decimal Number :");
		//Accept input from user
		int input_decimal_num = sc.nextInt();

		String binary_string = " ";

		//Loop continues till input_decimal_num >0
		while(input_decimal_num > 0){
			//remainder add to string variable 
			binary_string = input_decimal_num%2 + binary_string;
			input_decimal_num = input_decimal_num/2;
		}
		// Display Final Result 
		System.out.println("Conversion of decimal to binary is : " + binary_string);
	}
}
