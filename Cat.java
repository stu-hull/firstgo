public class Cat {
	private double age;
	private String breed;
	private String name;
	private String origin;

	public Cat(String n){
		name = n;
	}

	public double getAge(){
		return age;
	}

	public void setAge(double age){
		this.age = age;
	}

	public String getBreed(){
		return breed;
	}

	public void setBreed(String breed){
		this.breed = breed;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getOrigin(){
		return origin;
	}

	public void setOrigin(String origin){
		this.origin = origin;
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