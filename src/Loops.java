
public class Loops {
	
	public static void main(String[] args) {
	
		System.out.println("With while loop");
		int i = 0;		
		while(i < 100) {
			i++;
			System.out.println(i);
		}
		
		System.out.println("With do-while loop");
		
		i = 0;
		do {
			i++;
			System.out.println(i);
		} while(i < 100);
		
		System.out.println();
		System.out.println("With for loop");
		System.out.println();
		
		for(int k = 1; k <= 100; k += 2) {
			
			if(k > 50) {
				break;
			}
			
			System.out.println(k);		
		}
		
		for(int k = 1; k <= 100; k += 2) {
			
//			if(k < 50 || k > 60) {
//				System.out.println(k);
//			}
			
			if(k >= 50 && k <= 60) {
				continue;
			}
			
			System.out.println(k);
		}
		
		int sum = 0;
		for(int j = 1; j <= 100; j++) {
			sum = sum + j;
		}
	}
	
}
