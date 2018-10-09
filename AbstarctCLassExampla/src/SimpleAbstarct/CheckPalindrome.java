package SimpleAbstarct;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		System.out.println("Please Enter a number : ");
        int Num = new Scanner(System.in).nextInt();
        int number=Num;

        int reverse = 0;

	        while (Num != 0)
	        {
	            int remainder = Num % 10;
	            reverse = reverse * 10 + remainder;
	            Num = Num / 10;
	        }

	        // if original and reverse of number is equal means
	        // number is palindrome in Java
	        if (number == reverse) {
	            System.out.println("number is palindrome");
	        }
	        else
	        {
	        	System.out.println("number is  not palindrome");
	        }

	

	}

}
