package entities;

public class Produto {
	private String productName;
	private Double price;
	private Integer quantity;
	
	public Produto() {
		
	}
	
	public Produto(String productName, Double price, Integer quantity) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double amount() {
		return price * quantity;
	}
	
}
