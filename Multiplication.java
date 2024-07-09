public class Multiplication {

	public int multiplyMultiples (int numberOne, int numberTwo) {

		int sum = 0;

		int increase;

		for(increase = 1; increase <= numberOne;) {
		
			sum = sum + numberTwo;

			increase++;
		}
			return sum;
	}


}