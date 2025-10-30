package commandlineprograms;

public class AreaOfRectangleUsingCmd {

	public static void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		int breadth = Integer.parseInt(args[1]);
		int AreaOfRectangle = length * breadth ;
		System.out.println("The AreaOfRectangle is = " +AreaOfRectangle);

	}

}
