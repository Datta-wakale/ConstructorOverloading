package elc;

import java.util.Scanner;

import blc.InventoryItemBlc;

public class InventoryMainElc
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Item Name : ");
		String itemName = sc.nextLine();
		
		System.out.println("Enter price per Unit :");
		double pricePerUnit = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter Quantity in Stock : ");
		int quantityInStock=Integer.parseInt(sc.nextLine());
		
		InventoryItemBlc i1 = new InventoryItemBlc(itemName, pricePerUnit, quantityInStock);
		
		System.out.println("Inventory Item Details : ");
		
		System.out.println("Item Name : "+i1.getItemName());
		System.out.println("Price Per Unit : "+i1.getPricePerUnit());
		System.out.println("Quantity in Stock : "+i1.getQuantityInStock());
		System.out.println("Total Inventory value :"+i1.calculateTotalValue());
		
		
		System.out.println("Any updation in stock Price or Quantity :");
		String isValid = sc.nextLine();
		
		
		if(isValid.equalsIgnoreCase("yes"))
		{
			System.out.println("Enter New price per Unit :");
			double pricePerUnit2 = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter New Quantity in Stock : ");
			int quantityInStock2=Integer.parseInt(sc.nextLine());
			
			i1.setPricePerUnit(pricePerUnit2);
			i1.setQuantityInStock(quantityInStock2);
			
			System.out.println(" updated Inventory Item Details : ");
			System.out.println("Enter Item Name : "+itemName);
			System.out.println("Price Per Unit : "+pricePerUnit2);
			System.out.println("Quantity In Stock : "+quantityInStock2);
			System.out.println("Total Inventory Value : "+i1.calculateTotalValue());
			
			
		}
		else
		{
			System.exit(0);
		}
		
		
		sc.close();
	}

}
