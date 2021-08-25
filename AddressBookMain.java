import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Address book");
		AdressBookUser Entery = new AdressBookUser();
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many entry you want to make this time");
		Entery.addContact();

		System.out.println("you to make any changes in enter type yes or no");
		String input = sc.next();
		if (input.equals("yes")) {

			Entery.editContact();
		}
		sc.close();
	}
}
