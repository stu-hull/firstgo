public class Cat {
	private double age;
	private String breed;
	private String name;

	public Cat(double a){
		age = a;
	}

	public double getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public double humanage(){
		if (age<1){
			return 25*age;
		}else if (age<2){
			return 25 + (age-1)*10;
		}else{
			return 35 + (age-2)*4;
		}
	}
}