public class printer{
	public static void main(String[] args){

		boolean PaperTrayEmpty = false;
		int FilesWaiting = 0;

		if (PaperTrayEmpty == true){
			System.out.println("Please add paper");
		} else if (FilesWaiting > 0){
			System.out.println("Printing...");
		} else {
			System.out.println("Status OK");
		}

	}
}