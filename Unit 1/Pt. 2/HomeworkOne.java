public class HomeworkOne {

	public static void main(String[] args) {
		// This is to find the Area of a circle by using the known radius
		// We delcare area and radius as double because they may be decimal numbers
		double area, radius;
		radius = 1;
					
		area = Math.PI * (radius*radius);
                // This is our formula, pi r squared

		System.out.println("The area for a circle, where r=" + radius + " is " + area);
		
	}
}
