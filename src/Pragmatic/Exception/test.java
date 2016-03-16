package Pragmatic.Exception;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {

		try(Scanner keyboard = new Scanner(System.in)) {
			System.out.println("Type 2 digits");
			System.out.println("Type digit 1");
			double a = keyboard.nextInt();
			System.out.println("Type digit 2");
			double b = keyboard.nextInt();
			
			System.out.println(b / a);
			
		} catch (Exception ae) {
			throw new CustomException("Dawai 4isla be", ae);
			
			
		}
		System.out.println("continue");

	}
}
