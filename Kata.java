public class Kata {

	public static boolean isEven(int number) {
  			if(number % 2 == 0) return true;
			return false;
	}		



	public static boolean isPrime(int primeNumber) {
		
			if( primeNumber % 2 != 0 && primeNumber % 3 != 0 &&
				primeNumber % 5 != 0  && primeNumber % 7 != 0 ) return true;
				return false; 
	}




	public static int isFactorialOf(int isFactorial) {

			int factorial = 1;
			
			for( int number = 2; number <= isFactorial; number ++) {
				if (isFactorial % number == 0)
				factorial = factorial + number;
			}
				return factorial;
			
	}
		

}

