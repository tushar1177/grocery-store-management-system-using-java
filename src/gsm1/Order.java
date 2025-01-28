package gsm1;
public class Order{
	public Customer customer;
	public Product product;
	public int quantity;
	boolean isCancelled;
	boolean isCompleted;
	
	public Order(Customer customer, Product product, int quantity) {
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
		
		}
	public boolean isCompleted() {
		return !isCancelled;
	}
	
	
	
		public double calculateTotal() {
		return product.price * quantity;
		}
}