/***************************************************************
 * 
 * @author Nigel Whitaker 
 * Date: 11/14/2022 [M]
 *
 */
import java.util.Scanner;
public class Exercise06_04 {
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		reverse(number);
		input.close();
	}
	
	public static void reverse(int n) {
		if( n == 0) {
			System.out.print(n);
		}
		while( n != 0) {
			System.out.print(n % 10);
			n = n / 10;
		}
		
	}

}
