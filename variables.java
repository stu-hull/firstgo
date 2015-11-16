public class Dog{
	
	private String bark;
	private static String owner;
	private static String vet;

	public Dog(){
	}

	public String getBark(){
		return bark;
	}
	public void setBark(String bark){
		this.bark = bark;
	}

	public String getOwner(){
		return owner;
	}
	public void setOwner(String owner){
		this.owner = owner;
	}

	public String getVet(){
		return vet;
	}
	public void setVet(String vet){
		this.vet = vet;
	}
	
}