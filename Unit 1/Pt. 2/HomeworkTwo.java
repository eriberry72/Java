public class HomeworkTwo {

	public static void main(String[] args) {
		// This is to find the Volume of a sphere by using the known radius
                // We declare volume and radius as double because they may be decimals
		double volume, radius;
		radius = 15;
					
		volume = 4/3 * Math.PI * (radius*radius);
                // This is our formula, 4/3 pi r squared

		System.out.println("The volume of a sphere, where r=" + radius + " is " + volume);
		
	}
}
