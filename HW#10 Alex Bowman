/*Alex Bowman
 * HW#10
 * Professor Silvestri
 * 12/12/19
 */
package quadratic;

public class Quadratic {
	private double a, b, c;

	public Quadratic(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int noOfRoots() {
		double quad = b * b - 4 * a * c;
		if (quad == 0)
			return 1;
		else if (quad > 0)
			return 2;
		else
			return 0;
	}

	public double getRoot1() {
		double d = b * b - 4 * a * c;
		d = Math.sqrt(d);
		double quad = (-b + d) / (2 * a);
		return quad;
	}

	public double getRoot2() {
		double d = b * b - 4 * a * c;
		d = Math.sqrt(d);
		double quad = (-b - d) / (2 * a);
		return quad;

	}

}

