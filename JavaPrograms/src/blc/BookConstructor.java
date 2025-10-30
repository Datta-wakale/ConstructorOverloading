package blc;

public class BookConstructor {
	
	private String title;
	private String author;
	private double price;
	
	
	public BookConstructor(String title, String author, double price)
	{
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}



	public String toString() {
		return "BookConstructor [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	public void applyDiscount(double discountPercentage)
	{
		
		if(discountPercentage<0)
		{
			System.err.println("discountPercentage price Cannot be negative ");
			System.exit(0);
		}
		price = price -(price*discountPercentage)/100;
	}
	
	
	

}
