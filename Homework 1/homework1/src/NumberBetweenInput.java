import java.util.ArrayList;
import java.util.Scanner;

public class NumberBetweenInput {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    getInput(numbers);
  }

  /**
   * Gets the input and checks if the given values are Integer values else throws an exception
   *
   * @param numbers is the array of numbers between the given inputs
   */
  public static void getInput(ArrayList<Integer> numbers) {
    int firstNumber;
    int secondNumber;
    String msg_success = "Successful";
    String msg_error = "No numbers sit between the two given numbers";
    Scanner sc = new Scanner(System.in);
    try {
      firstNumber = sc.nextInt();
      secondNumber = sc.nextInt();
      String msg = getNumbers(firstNumber, secondNumber, numbers, msg_success, msg_error);
      if (msg == msg_success) {
        for (int num : numbers) {
          System.out.println(num);
        }
      } else {
        System.out.println(msg_error);
      }
    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
  }

  /**
   * If given inputs are valid, method adds the number between given int values in an array and
   * returns a success message else an error message.
   *
   * @param firstNumber  is the first input given by user
   * @param secondNumber is the second input given by user
   * @param numbers      is the array of numbers between the given inputs
   * @param msg_success  is the success message
   * @param msg_error    is the error message
   * @return a string which is either msg_success or msg_error
   */
  public static String getNumbers(int firstNumber, int secondNumber, ArrayList<Integer> numbers,
                                  String msg_success, String msg_error) {
    if (firstNumber == secondNumber) {
      return msg_error;
    }

    if (firstNumber > secondNumber) {
      int temp = firstNumber;
      firstNumber = secondNumber;
      secondNumber = temp;
    }

    for (int i = firstNumber + 1; i < secondNumber; i++) {
      numbers.add(i);
    }
    return msg_success;
  }
}
