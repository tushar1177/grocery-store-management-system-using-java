package gsm1;
import java.util.Scanner;

public class Product {
	                                		public int id;
	                                		public String name;
	                                		public int price;
	                                		public String description;
	                                		public int quantity;
		                                	Scanner scanner = new Scanner(System.in);


	                                		public void addProduct(int id) {
	                                		    // code to add a new product
	                                			this.id = id;
		                                		System.out.println("Enter product name: ");
			                                	this.name = scanner.next();
			                                	System.out.println("Enter price: ");
			                                	this.price = scanner.nextInt();
			                                	System.out.println("Enter product description: ");
			                                	this.description = scanner.next();
			                                	System.out.println("Enter quantity: ");
			                                	this.quantity = scanner.nextInt();
	                                		}

	                                	}