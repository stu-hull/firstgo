class ArraySearch{
	public static void main(String[] args){
		int myList[] = new int[]{1,5,23,55,230,234,252,301};
		System.out.println("the array is " + myList.length + " long");

		for(int i=0; i<myList.length; i++){
			System.out.println("value " + i + " is " + myList[i]);
		}

		int luckynumber = 235;
		boolean found = false;

		for(int i=0; i<myList.length; i++){
			if(myList[i] == luckynumber){
				found = true;
				break;
			}
		}

		if(found){
			System.out.println("found");
		} else {
			System.out.println("missing");
		}
	}
}