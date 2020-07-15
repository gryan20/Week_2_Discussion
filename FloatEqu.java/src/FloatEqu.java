
public class FloatEqu {

	public static void main(String[] args) {
		
		double a, b, TOLERANCE;
		a = (1.0/10)*(1.0/10);
		b = (1.0/100);
		TOLERANCE = 0.0001; //I set this to be 0.2 (double of the largest) since 1/100 is 0.01 and 1/10 is .1

		
	if (a == b)
	{
		System.out.println("EQUAL");
	}
	else
	{ System.out.println("Not EQUAL"); }
	
	if (Math.abs(b-a) <= TOLERANCE)
	{System.out.println("Essentially Equal");}


	}

}
