package elc;

import java.util.Scanner;

import blc.BookConstructor;

public class BookElc {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter title : ");
		String title=sc.nextLine();
		
		System.out.println("enter author name :");
		String author=sc.nextLine();
		
		System.out.println("Enter price : ");
		double price =Double.parseDouble(sc.nextLine());
		
		BookConstructor b1 = new BookConstructor(title, author, price);
		System.out.println(b1);
		
		b1.applyDiscount(price);
		
		sc.close();
		
		

	}

}
