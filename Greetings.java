import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

			System.out.print(" Enter 1 to be Greeted in English and 0 to be Greeted in Hausa: ");
			int language = input.nextInt();

			if ( language == 1)
			System.out.println(" You are welcome to Semicolon ");

			if (language == 0)
			System.out.println(" Inakwana Semicolon ");

	}
}


