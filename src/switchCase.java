import java.util.*;
public class switchCase {

	public static void main(String[] args) {
		int month = 0;
		String monthString = "null";
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		switch(month) {
		
		case 1 : monthString = "January";
		System.out.println(monthString);
		break;
		
		case 2 : monthString = "February";
		System.out.println(monthString);
		break;
		
		case 3 : monthString = "March";
		System.out.println(monthString);
        break;
        
		case 4 : monthString = "April";
		System.out.println(monthString);
		break;
		
		default : monthString = "Unknown Match";
		System.out.println(monthString);

		break;
				
		}

	}
}
