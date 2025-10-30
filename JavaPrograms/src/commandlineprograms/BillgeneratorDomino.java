package commandlineprograms;

public class BillgeneratorDomino {

	public static void main(String[] args) {
		
		
		int NoOfChickenRoll = Integer.parseInt(args[0]);
		int NoOfVegPuff = Integer.parseInt(args[1]);
		int ChickenRoll = NoOfChickenRoll * 60;
		int VegPuff = NoOfVegPuff * 25;
		int finalprice = ChickenRoll + VegPuff;
		int FinalBill = finalprice - 50 ;
		System.out.println("Final bill with 50rs discount is : "+FinalBill);

	}

}
