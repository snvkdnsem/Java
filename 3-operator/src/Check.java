
public class Check {

	public static void main(String[] args) {
		// #2
		Math math = new Math();
		
		//double result = Math.round();
		double result = math.round(3.141592, 4);
		
		System.out.println("result = " + result);
	}

}

class Math{
	// #1 static
	double round(double value, int position) {
		double x = java.lang.Math.pow(10, position - 1);
		return java.lang.Math.round(value * x) / (double)x;	}
}