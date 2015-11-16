public class CreateDog{
	public static void main(String[] args){
		
		Dog rex = new Dog();
		rex.setBark("woof, grrr");
		System.out.println("Rex:" + rex.getBark());

		Dog terry = new Dog();
		terry.setOwner("Mr. Basu");
		System.out.println("Terry: My owner is " + terry.getOwner());

		Dog jeff = new Dog();
		jeff.setVet("Dr. Steve");
		System.out.println("Jeff: I'm looked after by " + jeff.getVet());
	}
}