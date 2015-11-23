public class FizzBuzz{
	public static void main(String[] args){

		for (int lenny = 1; lenny <= 30; lenny++){

			if ((lenny % 3 == 0) && (lenny % 5 == 0)){
				System.out.println("fizzbuzz");
			
			} else if (lenny % 3 == 0){
				System.out.println("fizz");
			
			} else if (lenny % 5 == 0){
				System.out.println("buzz");
			
			} else {
				System.out.println(lenny);
			}
		
		}
	}
}