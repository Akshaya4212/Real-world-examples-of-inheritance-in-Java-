package device;

import java.util.Scanner;
class User{
	String username;
	String email;
	
	void login() {
		System.out.println(username + " is logging in");

	}
}

class Customer extends User{
	void placeOrder() {
		System.out.println("order placed");
	}
}

class Admin extends User{
	void manageInventory() {
		System.out.println("Inventory Managed");
	}
}


public class Ecommerce {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name:");
		String username=sc.nextLine();
		
		System.out.println("enter Email (without @gmail.com):");
		String email=sc.nextLine();
		
		Admin adminUser = new Admin();
		adminUser.username = username;
		adminUser.email = email + "@gmail.com";
		
		System.out.println("welcome," + adminUser.username);
		System.out.println("Email:" + adminUser.email);
		
		adminUser.manageInventory();
		adminUser.login();
		sc.close();
		
		

	}

}
