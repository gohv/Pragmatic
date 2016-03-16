import java.util.Scanner;

public class ArrayLecture {

	public static void main(String[] args) {
		
			int[] array = new int[10];
			 for(int i = 0; i < 5; i++){
				 Scanner key = new Scanner(System.in);
				 System.out.println("Number: " + i);
				 array[i] = key.nextInt();				 
			 }
			 System.out.println("Reverse: ");
			for(int i = 4; i>= 0; i--){
				System.out.println(array[i]);
			}
			 
			 
			 
			 
	}

}
