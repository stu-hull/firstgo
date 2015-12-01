public class stack{
	
	public stack(int a){
		private int stack[] = new int[30];
		private int stackPointer = 0;
	}

	public void push(self, int a){
		
		if (self.stackPointer == 30){
			System.out.println("No more space");
			break;

		self.stackPointer += 1;
		self.stack[self.stackPointer] = a;
	}

	public int pop(self){
		
		if 
		
		int value = self.stack[self.stackPointer];
		stackPointer -= 1;
		return value;
	}
}
