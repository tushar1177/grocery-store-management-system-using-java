package gsm1;
import java.util.Scanner;

public class Customer {
	                                		public int id;
	                                		public String name;
	                                		public String mobile;
	                                		public String address;
	                                		public String username;
	                                		public String password;
		                                	Scanner scanner = new Scanner(System.in);
	                                	

	                                		public Order[] orders;
	                                		
	                                		public Customer() {};
	                                		public Customer(int id, String name, String mobile, String address, String username, String password) {
	                                		    this.id = id;
	                                		    this.name = name;
	                                		    this.mobile = mobile;
	                                		    this.address = address;
	                                		    this.username = username;
	                                		    this.password = password;
	                                		    this.orders = new Order[10];
	                                		}

	                                		public void addCustomer(int id) {
	                                		    // code to add a new customer
	                                			this.id=id;
	                                			System.out.println("Enter your name: ");
	    	                                	this.name = scanner.next();
	    	                                	System.out.println("Enter your mobile number: ");
	    	                                	this.mobile = scanner.next();
	    	                                	System.out.println("Enter your address: ");
	    	                                	this.address = scanner.next();
	    	                                	System.out.println("Enter a username: ");
	    	                                	this.username = scanner.next();
	    	                                	System.out.println("Enter a password: ");
	    	                                	this.password = scanner.next();
	    	                                	
	    	                                
	                                			
	                                		}

	                                		
	                                	}