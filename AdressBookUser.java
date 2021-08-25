
import java.util.ArrayList;
import java.util.Scanner;

public class AdressBookUser {

	ArrayList<Contactsuser> contact = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Contactsuser userData;
	int noOfEntery;
	String userFirstName, userLastName, address, city, state, mailId;
	long pinCode;
	long phoneNumber;

	void addContact() {
		noOfEntery = sc.nextInt();
		for (int i = 0; i < noOfEntery; i++) {
			System.out.println("Your First Name ");
			userFirstName = sc.next();
			System.out.println("Your Last Name");
			userLastName = sc.next();
			System.out.println("Your Address");
			address = sc.next();
			System.out.println("Your City");
			city = sc.next();
			System.out.println("Your State");
			state = sc.next();
			System.out.println("Enter your Mailid");
			mailId = sc.next();
			System.out.println("Enter Your PinCode");
			pinCode = sc.nextInt();
			System.out.println("Enter PhoneNumber");
			phoneNumber = sc.nextLong();
			contact.add(
					new Contactsuser(userFirstName, userLastName, address, city, state, pinCode, phoneNumber, mailId));
		}

		for (int i = 0; i < noOfEntery; i++) {
			userData = contact.get(i);
			System.out.println(userData.userFirstName + "  " + userData.userLastName + " " + userData.address + " "
					+ userData.city + " " + userData.state + " " + userData.mailId + " " + userData.pinCode + " "
					+ userData.phoneNum);
		}
	}
}