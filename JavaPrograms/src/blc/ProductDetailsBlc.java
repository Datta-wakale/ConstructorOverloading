package blc;

public class ProductDetailsBlc {

	
	private int id;
	private String name;
	private double price;
	
	public void setProductDetails(int id,String name,double price)
	{
		
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
	
	public void cacculateDiscount()
	{
		
		double discount=this.price;
		
		if(discount<1000)
		
		{
			System.out.println("The discounted amount is :"+discount*5/100);
			discount -=discount*5/100;
		}
		else if(discount>=1000 && discount<=5000)
		{
			System.out.println("The discounted amount is :"+discount*10/100);
			discount-=discount*10/100;
		}
		else if(discount >5000)
		{
			System.out.println("The discounted amount is :"+discount*15/100);
			discount-=discount*15/100;
		}
		
		System.out.println("final price after Discount Amount:"+discount);
	}


	public String toString() 
	{
		return "ProductDetailsBlc [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	
}
