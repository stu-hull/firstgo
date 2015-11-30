import java.util.*;
import java.io.*;

public class writefile{
	public static void main(String[] args) throws IOException{

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence to save to a file:");
		String sentence = input.nextLine();

		FileWriter file = new FileWriter("data.txt");
		PrintWriter output = new PrintWriter(file);
		output.print(sentence);

		output.close();
		file.close();
	}
}