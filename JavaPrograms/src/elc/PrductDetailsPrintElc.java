package elc;

import java.util.Scanner;

import blc.ProductDetailsBlc;

public class PrductDetailsPrintElc {

	public static void main(String[] args) {
		
		
		ProductDetailsBlc p1= new ProductDetailsBlc();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter product id :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter product Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter product price : ");
		double price =Double.parseDouble(sc.nextLine());
		
		p1.setProductDetails(id, name, price);
		
		System.out.println("--------- product Details --------");
		
		System.out.println(p1);
		
		p1.cacculateDiscount();
		
		sc.close();

	}

}
