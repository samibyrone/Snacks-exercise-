import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

	@Test
	public void testMultiplicationToWork() {

		//Given
		Multiplication multiplication = new Multiplication();

		//When
		int numberOne = 6;
		int numberTwo = -5;
		int result = multiplication.multiplyMultiples(numberOne, numberTwo);

		//Assert
		assertEquals(-30, result);

	}


}