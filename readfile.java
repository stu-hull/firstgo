import java.util.*;
import java.io.*;

public class readfile{
	public static void main(String[] args) throws IOException{

		Scanner datafile = new Scanner(new File("data.txt"));

		int n = -1;
		String lines[] = new String[999];

		while (datafile.hasNext()){
			n++;
			lines[n] = datafile.nextLine();
		}
		
		datafile.close();

		for (int i = 0; i <= n; i++){
			System.out.println(lines[i]);
		}


	}
}