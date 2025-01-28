package gsm1;
import java.util.Scanner;

public class User {
	                                	public int id;
	                                	public String name;
	                                	public String mobile;
	                                	public String username;
	                                	public String password;

	                                	public User() {}
	                                	Scanner scanner = new Scanner(System.in);

	                                	public void addUser(int id) {
	                                	    // code to add a new user
	                                		this.id = id;
	                                		System.out.print("Enter your name: ");
		                                	this.name = scanner.nextLine();
		                                	System.out.print("Enter your mobile number: ");
		                                	this.mobile = scanner.nextLine();
		                                	System.out.print("Enter a username: ");
		                                	this.username = scanner.nextLine();
		                                	System.out.print("Enter a password: ");
		                                	this.password = scanner.nextLine();
	                                		
	                                	}

	                                	}