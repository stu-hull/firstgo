public class CatCreate {
	public static void main(String[] args){
		
		Cat puss = new Cat("Puss");
		Cat casper = new Cat("Casper");
		Cat kitty = new Cat("Kitty");

		puss.setAge(4);
		puss.setBreed("Siamese");
		puss.setOrigin("Russian");
		double puss_h_age = puss.humanage();

		casper.setAge(6.5);
		casper.setBreed("Tabby");
		casper.setOrigin("Spanish");
		double casper_h_age = casper.humanage();

		kitty.setAge(1.2);
		kitty.setBreed("Unknown");
		kitty.setOrigin("English");
		double kitty_h_age = kitty.humanage();


		System.out.println("My name is ", puss.getName(), 
			", I am a ", puss.getOrigin(), puss.getBreed(),
			" and I am ", puss.getAge(), " years old.");
	}
}