import java.util.Scanner;
import java.text.NumberFormat;

public class DistCalc {

	public static void main(String[] args) {
		// 

		double x1, x2, y1, y2, a, b;
		x1 = 23;
		x2 = 28;
		y1 = 52;
		y2 = 57;
		
		a = ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		b = Math.sqrt(a);
		
	System.out.println(String.format("%.3f", b));
	
	
		
		
	}

}
