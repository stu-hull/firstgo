import java.util.Scanner;

public class Square{
  public static void main(String[] args){
	  
	  Scanner input = new Scanner(System.in);
	  int x = 1;
	  do {
		  System.out.println("Enter a whole number: ");
		  x = input.nextInt();
		  System.out.println(x*x);
	  } while (x != 0);
	  
	}
}
