import java.util.Scanner;
import java.util.Random;

public class UserNames {

	

	public static void main(String[] args) {
		String firstName;
		String lastName;
		String finalName;
		Random rand = new Random();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your first name: ");
		firstName = scan.next();
		
		System.out.println("Please enter your last name: ");
		lastName = scan.next();
		
		scan.close();
		
		finalName = lastName.substring(0,4);
		finalName += firstName.substring(0,1);
		finalName += rand.nextInt(99) + 10;
		
		System.out.println(finalName);
		
		
	}

}
