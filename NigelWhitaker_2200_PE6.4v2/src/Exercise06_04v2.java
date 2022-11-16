/***************************************************************
 * 
 * @author Nigel Whitaker 
 * Date: 11/16/2022 [W]
 *
 */
import java.util.Scanner;
public class Exercise06_04v2 {
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		reverse(number);
		input.close();
	}
	
	public static void reverse(int number) {
		if (number < 0) {
			System.out.print("-");
			reverse(number * -1);
		} else if (number < 10) {
			System.out.println(number);
		} else {
			System.out.print(number % 10);
			reverse(number / 10);
		}
	}
}
		

