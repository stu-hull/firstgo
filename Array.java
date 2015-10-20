import java.io.*;
import java.util.*;

public class Array{
	public static void main(String[] args){
		
		String names[] = {"Stuart", "Ben", "Lenny", "Will", "Steve"};
		int size = names.length;

		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter a name:");
		String request = getInput.nextLine();

		for (int n=0; n<size; n++) {
			if (names[n].equals(request)) {
				System.out.println("Yes"); 
				System.exit(0);
			}
		}

		System.out.println("No");
	}
}