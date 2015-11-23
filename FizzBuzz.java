import java.util.Scanner;

public class FizzBuzz{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to play up to: ");
		int x = input.nextInt();

		for (int lenny = 1; lenny <= x; lenny++){

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