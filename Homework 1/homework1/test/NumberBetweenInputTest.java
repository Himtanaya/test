import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * A JUnit test for NumberBetweenInput class.
 */
public class NumberBetweenInputTest {

  private NumberBetweenInput numberBetweenInput;
  private ArrayList<Integer> numbers = new ArrayList<>();
  private String msg_success = "Successful";
  private String msg_error = "No numbers sit between the two given numbers";

  @Before
  public void setup(){
    numberBetweenInput = new NumberBetweenInput();
  }

  @Test
  public void testSameNumberInput()
  {
    String message = numberBetweenInput.getNumbers(10, 10, numbers,
            msg_success, msg_error);
    assertEquals(message, msg_error);
  }

  @Test
  public void testOutputPositiveNumbers()
  {
    ArrayList<Integer> actualNumber = new ArrayList<>();
    actualNumber.add(11);
    actualNumber.add(12);
    actualNumber.add(13);
    actualNumber.add(14);
    String message = numberBetweenInput.getNumbers(10, 15, numbers,
            msg_success, msg_error);
    assertEquals(numbers, actualNumber);
    assertEquals(message, msg_success);
  }

  @Test
  public void testOutputNegativeNumbers()
  {
    ArrayList<Integer> actualNumber = new ArrayList<>();
    actualNumber.add(-14);
    actualNumber.add(-13);
    actualNumber.add(-12);
    String message = numberBetweenInput.getNumbers(-11, -15, numbers,
            msg_success, msg_error);
    assertEquals(numbers, actualNumber);
    assertEquals(message, msg_success);
  }

}