import java.util.Scanner;

public class KataChecker {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Function that takes integer an returns TRUE if it's even NUMBER.. ");
		System.out.println(" Enter a number ");
		int number = input.nextInt();

		System.out.println(Kata.isEven(number) + " is an Even number " );
		System.out.println();

		
	
		System.out.println(" Function that takes integer an returns TRUE if the number is a PRIME NUMBER.. ");	
		System.out.print(" Enter your number ");
		int primeNumber = input.nextInt();

		System.out.println(Kata.isPrime(primeNumber) + " is a Palindrome Number. " );
		System.out.println();




		System.out.println(" Function that takes 2 INTEGER an returns POSITIVE DIFFRENCE irrespective of the parameter.. ");
		
		System.out.print(" Enter your number ");
		int isFactorial = input.nextInt();

		System.out.println(Kata.isFactorialOf(isFactorial) + " is the Factorial. ");
		System.out.println();

		


//		System.out.println(" ");
//

//		System.out.println(" Enter your number ");
//		int isPalindrome = input.nextInt();
//
//		System.out.println(Kata.isPalindrome(int number) + " is a Palindrome. ");
		
	}

}
