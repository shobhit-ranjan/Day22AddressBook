
import java.util.ArrayList;
import java.util.Scanner;

public class AdressBookUser {

	static ArrayList<Contactsuser> contactofuser = new ArrayList<>();
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
			try {
				for (int j = 0; j <= contactofuser.size(); j++) {
					if (contactofuser.isEmpty()) {
						break;
					} else {
						if (userFirstName.equals(userData.userFirstName))
							throw new UserIsThere();
					}
				}

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
				contactofuser.add(new Contactsuser(userFirstName, userLastName, address, city, state, pinCode,
						phoneNumber, mailId));
			} catch (UserIsThere e) {
				System.out.println(e.getMessage());
			}

			for (int k = 0; k < noOfEntery; k++) {
				userData = contactofuser.get(i);
				System.out.println(userData.userFirstName + "  " + userData.userLastName + " " + userData.address + " "
						+ userData.city + " " + userData.state + " " + userData.mailId + " " + userData.pinCode + " "
						+ userData.phoneNum);
			}

		}
	}

	void editContact() {
		System.out.println("Enter the name of the person");
		userFirstName = sc.next();
		int counter = 0;
		for (int i = 0; i < contactofuser.size(); i++) {
			userData = contactofuser.get(i);
			if (userFirstName.equals(userData.userFirstName)) {
				System.out.println();
				System.out.println("Do u want to edit entire contact details? yes or no");
				String ch = sc.next();
				if (ch.equals("yes")) {
					System.out.println("Enter your new address:");
					address = sc.next();
					System.out.println("Enter your new city:");
					city = sc.next();
					System.out.println("Enter your new state:");
					state = sc.next();
					System.out.println("Enter your new email:");
					mailId = sc.next();
					System.out.println("Enter your new zip:");
					pinCode = sc.nextInt();
					System.out.println("Enter your new phn number:");
					phoneNumber = sc.nextLong();
					contactofuser.set(i, new Contactsuser(userFirstName, userLastName, address, city, state, pinCode,
							phoneNumber, mailId));
					counter = 1;
				} else {
					System.out.println();
					System.out.println(
								"Enter the Number which you want to edit :1 firstname 2 lastname 3 Address 4.City 5.State 6.EmailUD 7 PinCode 8.PhoneNumber  ");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter your new first name:");
						userFirstName = sc.next();
						contactofuser.set(i, new Contactsuser(userFirstName, userLastName, address, city, state,
								pinCode, phoneNumber, mailId));
						break;
					case 2:
						System.out.println("Enter your new last name:");
						userLastName = sc.next();
						contactofuser.set(i, new Contactsuser(userFirstName, userLastName, address, city, state,
								pinCode, phoneNumber, mailId));
						break;
					case 3:
						System.out.println("Enter your new address:");
						address = sc.next();
						contactofuser.set(i, new Contactsuser(userFirstName, userLastName, address, city, state,
								pinCode, phoneNumber, mailId));
						break;
					case 4:
						System.out.println("Enter your new city:");
						city = sc.next();
						contactofuser.set(i, new Contactsuser(userFirstName, userLastName, address, city, state,
								pinCode, phoneNumber, mailId));
						break;
					case 5:
						System.out.println("Enter your new state:");
						state = sc.next();
						contactofuser.set(i, new Contactsuser(userFirstName, userLastName, address, city, state,
								pinCode, phoneNumber, mailId));
						break;
					case 6:
						System.out.println("Enter your new email:");
						mailId = sc.next();
						contactofuser.set(i, new Contactsuser(userFirstName, userLastName, address, city, state,
								pinCode, phoneNumber, mailId));
						break;
					case 7:
						System.out.println("Enter your new zip");
						pinCode = sc.nextInt();
						contactofuser.set(i, new Contactsuser(userFirstName, userLastName, address, city, state,
								pinCode, phoneNumber, mailId));
						break;
					case 8:
						System.out.println("Enter your new phn number");
						phoneNumber = sc.nextLong();
						contactofuser.set(i, new Contactsuser(userFirstName, userLastName, address, city, state,
								pinCode, phoneNumber, mailId));
						break;

					}
					counter = 1;
				}

				System.out.println("After new entery");

				for (i = 0; i < noOfEntery; i++) {
					userData = contactofuser.get(i);
					System.out.println(userData.userFirstName + " " + userData.userLastName + " " + userData.address
							+ " " + userData.city + " " + userData.state + " " + userData.mailId + " "
							+ userData.pinCode + " " + userData.phoneNum);
				}
				if (counter == 0)
					System.out.println("you have not enterd the correct name");

			}

		}
	}

	public void DeleteUserEntery() {
		System.out.println();
		System.out.println("Enter the name of person you want to delete");
		userFirstName = sc.next();
		int counter = 0;
		for (int i = 0; i < contactofuser.size(); i++) {
			userData = contactofuser.get(i);
			if (userFirstName.equals(Contactsuser.userFirstName)) {
				contactofuser.remove(userData);
				counter = 1;
				System.out.println();
				System.out.println("yes its deleted");
			}
		}
		if (counter == 0) {

			System.out.println("invalid input");
		}
	}

	public void searchFromStateOrCity() {
		if (contactofuser.isEmpty()) {
			System.out.println("There in entry of any user");
			return;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 if you want to search by city name else press any number for searching by state");
		int temp = sc.nextInt();
		if (temp == 1) {
			System.out.println("Enter City Name: ");
			String city = sc.next();

			for (int i = 0; i < contactofuser.size(); i++) {
				if (contactofuser.get(i).getState() == city) {
					System.out.println("  " + contactofuser.get(i).getFirstName());
				}
			}
		} else {
			System.out.println("Enter State Name: ");
			String State = sc.next();
			for (int i = 0; i < contactofuser.size(); i++) {
				if (contactofuser.get(i).getCity() == State) {
					System.out.println("  " + contactofuser.get(i).getFirstName());
				}
			}
		}
	}
}

@SuppressWarnings("serial")
class UserIsThere extends Exception {
	@Override
	public String getMessage() {
		return "User of this name is present";
	}
}