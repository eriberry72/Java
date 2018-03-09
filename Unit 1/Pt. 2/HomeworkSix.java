public class HomeworkSix {

	public static void main(String[] args) {
	
		// Find the roots
                // We will use the quadratic formula with a, b and c from a standard form quadratic
                // y = a * (x * x) + (b * x) + c;
		
		double root1, root2;
		double a, b, c;
	
		a = 0.5;
		b = -2;
		c = -5;
		
		root1 = (-b + Math.sqrt (b*b - (4*a*c))) / (2*a); 
		root2 = (-b - Math.sqrt (b*b - (4*a*c))) / (2*a); 
		
		System.out.println("The roots are: " + root1 + " and " + root2);

	}

}
