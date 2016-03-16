import java.util.Scanner;
import static java.lang.System.out;

public class alarmTime {

	public static void main(String[] args) {
		out.println("Weekend?: ");
		Scanner keyboard = new Scanner(System.in);
		boolean isWeekend = keyboard.nextBoolean();

		int alarmTime = isWeekend ? 10 : 8; // 10 se izpolzwa za true; 8 za
											// false

		switch (alarmTime) {
		case 1:
			System.out.println("kur");
			break;

		case 2:

			break;
			default:
				System.out.println("qko");
		}

	}

}
