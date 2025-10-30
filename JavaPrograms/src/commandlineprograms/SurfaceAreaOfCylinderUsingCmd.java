package commandlineprograms;

public class SurfaceAreaOfCylinderUsingCmd {

	public static void main(String[] args) {
		
		
		final double PI = 3.14;
		
		double radius = Double.parseDouble(args[0]),
				
				height = Double.parseDouble(args[1]);
		
		double surface_AreaOfCylinder = 2 * PI * radius * 2 * PI * radius * height;
		
		System.out.println("The surface area of Cylinder is = " +surface_AreaOfCylinder);
		
		
				
		
		

	}

}
