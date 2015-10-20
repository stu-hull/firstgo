public class CatCreate {
	public static void main(String[] args){
		
		Cat puss = new Cat(5);
		Cat casper = new Cat(1.5);
		Cat kitty = new Cat(0.5);

		System.out.println(puss.getAge());

		puss.setAge(4);
		System.out.println(puss.getAge());

		double humanage = puss.humanage();
		System.out.println(humanage);
		humanage = casper.humanage();
		System.out.println(humanage);
		humanage = kitty.humanage();
		System.out.println(humanage);
	}
}