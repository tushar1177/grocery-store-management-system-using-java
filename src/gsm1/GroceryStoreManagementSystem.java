package gsm1;
import java.util.Scanner;
import gsm2.pattern;

public class GroceryStoreManagementSystem {
	
	public static void main(String[] args) {
		while(true) {
		try {
	    Scanner scanner = new Scanner(System.in);
	    User[] users = new User[10];
	    Customer[] customers = new Customer[10];
	    Product[] products = new Product[10];
	    Order[] orders = new Order[10];
	    int userCount = 0;
	    int customerCount = 0;
	    int productCount = 0;
	    int orderCount = 0;
	    Thread t1 = new pattern();
	    t1.start();


	    boolean running = true;
	    
	    while (running) {
	    	
	        System.out.println("Welcome to the Grocery Store Management System!");
	        System.out.println("1. Admin Portal");
	        System.out.println("2. Customer Portal");
	        System.out.println("3. Close Application");
	        System.out.println("Enter your choice: ");
	        int choice1 = scanner.nextInt();
	        
	        if(choice1 == 1) {
	        	System.out.println("1. Login");
		        System.out.println("2. Register");
		        System.out.println("3. Exit");
		        System.out.print("Enter your choice: ");
		       int choice2 = scanner.nextInt();
		        scanner.nextLine();
	        	switch(choice2) {
	        	case 1:
	        		System.out.print("Enter your username: ");
	                String username = scanner.nextLine();
	                System.out.print("Enter your password: ");
	                String password = scanner.nextLine();
	                boolean authenticated1 = false;
	                User currentUser = null;
	                for (User u : users) {
	                    if (u != null && u.username.equals(username) && u.password.equals(password)) {
	                        authenticated1 = true;
	                        currentUser = u;
	                        break;
	                    }
	                }
	                
	                if (authenticated1) {
	                	
	                    System.out.println("Welcome, " + currentUser.name + "!");
	                    boolean userRunning = true;
	                    while (userRunning) {
	                        System.out.println("1. Add Product");
	                        System.out.println("2. Add Customer");
	                        System.out.println("3. View Customers");
	                        System.out.println("4. Logout");
	                        System.out.print("Enter your choice: ");
	                        int customerChoice = scanner.nextInt();
	                        scanner.nextLine();
	                        switch (customerChoice) {
	                            case 1:
	                            	Product newProduct = new Product();
	            					products[productCount] = newProduct;
	            					products[productCount].addProduct(productCount+1);
	                            	productCount++;
	                            	break;
	            	        	
	                            case 2:
	                            	Customer newCustomer = new Customer();
	            					customers[customerCount] = newCustomer;
	            					customers[customerCount].addCustomer(customerCount+1);
	            					customerCount++;
	                            	break;
	                            case 3:
                            		for (Customer c : customers) {
	                                    if (c != null) {
	                                        System.out.println("Name: " + c.name + " address: " + c.address + " mobile: " + c.mobile);
	                                    }
	                                   
                            		}
                            		break;
	                            
	                                	case 4:
	                                	userRunning = false;
	                                	break;
	                                	
	                                	default:
	                                	System.out.println("Invalid choice.");
	                                	break;
	                                	
	                                	}
	                        
	                                	}} else {
	                                	System.out.println("Invalid username or password.");
	                                	}
	                                	break;
	                                	
	        	case 2:
	        		User newUser = new User();
					users[userCount] = newUser;
					users[userCount].addUser(userCount+1);
                	userCount++;
                	break;
	        	case 3:
                	break;	
                default:
                	System.out.println("Invalid choice.");	
	        	}	
	        }
	        
	        else if(choice1 == 2) {
	   
	        System.out.println("1. Login");
	        System.out.println("2. Register");
	        System.out.println("3. Log out");
	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();
	        scanner.nextLine();
	        switch (choice) {
	            case 1:
	                System.out.print("Enter your username: ");
	                String username = scanner.nextLine();
	                System.out.print("Enter your password: ");
	                String password = scanner.nextLine();
	                boolean authenticated = false;
	                Customer currentCustomer = null;
	                for (Customer c : customers) {
	                    if (c != null && c.username.equals(username) && c.password.equals(password)) {
	                        authenticated = true;
	                        currentCustomer = c;
	                        break;
	                    }
	                }
	                if (authenticated) {
	                    System.out.println("Welcome, " + currentCustomer.name + "!");
	                    boolean customerRunning = true;
	                    while (customerRunning) {
	                        System.out.println("1. View Products");
	                        System.out.println("2. Place Order");
	                        System.out.println("3. View Order History");
	                        System.out.println("4. Logout");
	                        System.out.print("Enter your choice: ");
	                        int customerChoice = scanner.nextInt();
	                        scanner.nextLine();
	                        switch (customerChoice) {
	                            case 1:
	                                for (Product p : products) {
	                                    if (p != null) {
	                                        System.out.println(p.id + ". " + p.name + " - Rs." + p.price);
	                                    }
	                                }
	                                break;
	                            case 2:
	                                System.out.print("Enter the ID of the product you want to order: ");
	                                int productId = scanner.nextInt();
	                                Product selectedProduct = null;
	                                for (Product p : products) {
	                                    if (p != null && p.id == productId) {
	                                        selectedProduct = p;
	                                        break;
	                                    }
	                                }
	                                if (selectedProduct != null) {
	                                	System.out.print("Enter the quantity you want to order: ");
	                                	int quantity = scanner.nextInt();
	   
	                                	Order newOrder = new Order(currentCustomer, selectedProduct, quantity);
	                                	orders[orderCount] = newOrder;
	                                	orderCount++;
	                                	System.out.println("Your order has been placed successfully. Your total bill amount is: Rs." + newOrder.calculateTotal());
	                                	} else {
	                                	System.out.println("Invalid product ID.");
	                                	}
	                                	break;
	                                    case 3:
	                            	    System.out.println("Your order history: ");
	                            	    for (Order o : orders) {
	                            	    if (o != null && o.customer.equals(currentCustomer) && o.isCompleted()) {
	                            	    System.out.println( "product name " + o.product.name + " - " + o.quantity + " units - $" + o.calculateTotal());
	                            	    }
	                            	    }
	                                	break;
	                                	case 4:
	                                	customerRunning = false;
	                                	break;
	                                	default:
	                                	System.out.println("Invalid choice.");
	                                	break;
	                                	}
	                                	}
	                                	} else {
	                                	System.out.println("Invalid username or password.");
	                                	}
	                                	break;
	                                	case 2:
	                                	System.out.print("Enter your name: ");
	                                	String name = scanner.nextLine();
	                                	System.out.print("Enter your mobile number: ");
	                                	String mobile = scanner.nextLine();
	                                	System.out.print("Enter your address: ");
	                                	String address = scanner.nextLine();
	                                	System.out.print("Enter a username: ");
	                                	username = scanner.nextLine();
	                                	System.out.print("Enter a password: ");
	                                	password = scanner.nextLine();
	                                	Customer newCustomer = new Customer(customerCount+1, name, mobile, address, username, password);
	                                	customers[customerCount] = newCustomer;
	                                	customerCount++;
	                                	System.out.println("Your account has been created successfully.");
	                                	break;
	                                	
	                                	case 3:
	                                	break;
	                                	
	                                	default:
	                                	System.out.println("Invalid choice.");
	                                	}
	                                	}
	        else if ( choice1 == 3) {
	        	running = false;
		        System.out.println("Thanks for visiting us");

	        }
	        else {
	        	System.out.println("Invalid choice");
	        }
	                                	}
	                                	}
		catch(Exception e) {
			System.out.println("Exception found : "+e);
			System.out.println("********** Continue to use the application from beginning **********");

			continue;
		}
		finally {
		}
		}
	}
}


	                                	
	                                	
	                                	
	                                	
	                                	
	                                	