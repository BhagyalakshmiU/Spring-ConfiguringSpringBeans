package food;


public class Fruit 
{

	public Fruit() {}
	private String description="not set";
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String talkAboutYourself()
	{
		return description;
		
		
	}
	

	public void initMethod() {
		System.out.println("The fruit bean is ready to go."+this.description);
	}

	public void destroytMethod() {
		System.out.println("The fruit bean is about to be destroyed");
	}

}




