import java.util.Scanner;

import sun.reflect.generics.repository.FieldRepository;

import java.util.Random;
import static java.lang.System.out;

public class workShop {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int answer;
		int firstNumber = new Random().nextInt(10)+1;
		int secondNumber = new Random().nextInt(10)+1;
		int equals = firstNumber * secondNumber;
		out.println(firstNumber +"*" + secondNumber + "=");
		
		do{
			out.println("Answer: ");
			answer = keyboard.nextInt();
		}while(answer != equals);
	}

}
