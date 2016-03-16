import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		

		int[] a = new int[10];
		a[3] = 5;
		System.out.println(a[3]);
		
		System.out.println(a);
		
		int[] b = {-2, 5, 10, -7};
		
		////////////
		
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[55]; 
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Enter number " + i + ": ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("Reversed order is: ");
		
		for(int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
		
		// Print all the elements in the array using standard for loop
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// Print all the elements in the array using for-each loop
		for(int i : numbers) {
			System.out.println(i);
		}
	}
	
}
