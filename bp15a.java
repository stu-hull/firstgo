public class bp15a{
	public static void main(String[] args){
		Circle cir1 = new Circle(35.5);
		Circle cir2 = new Circle(35.2);

		System.out.println("The area of circle 1 is " + cir1.Area());

		Circle cir3 = new Circle(39.1);
		Circle cir4 = new Circle(11.65);

		System.out.println("The circumference of circle 1 is " + cir1.Circumference());
		System.out.println("The diameter of circle 1 is " + cir1.Diameter());
	}
}