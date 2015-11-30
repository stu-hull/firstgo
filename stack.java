public class stack{
	
	int stack[] = new int[30]{4,1,7};
	int stackPointer = 0;

	public void push(self, int a){
		
		If (self.stackPointer == 30){
			System.out.println("No more space");
			break;

		self.stackPointer += 1;
		self.stack[self.stackPointer] = a;
	}

	public int pop(self){
		
		int value = self.stack[self.stackPointer];
		stackPointer -= 1;
		return value;
