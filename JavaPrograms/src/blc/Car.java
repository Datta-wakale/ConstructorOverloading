package blc;

public class Car {

	private String model;
	private int year;
	private double price;
	
	public Car(String model, int year, double price) 
	{
		super();
		if(price<0)
		{
			System.err.println("Price Must be positive");
			System.exit(0);
		}
		this.model = model;
		this.year = year;
		this.price = price;
	}


	public String toString()
	{
		return "Car [model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	
	
	
}
