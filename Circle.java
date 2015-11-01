public class Circle{
	
	public double radius;

	public Circle(double r){
		radius = r;
	}

	public double Area(){
		double a = Math.PI * radius * radius;
		return a;
	}

	public double Circumference(){
		double c = 2 * Math.PI * radius;
		return c;
	}

	public double Diameter(){
		double d = 2 * radius;
		return d;
	}

	public void setRadius(double nr){
		radius = nr;
	}
}