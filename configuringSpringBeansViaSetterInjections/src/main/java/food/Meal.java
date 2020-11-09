package food;


public class Meal
{
   private Grain grain;
   private Meat meat;
   private Vegetable veg;
   private Fruit fruit;
   public Fruit getFruit() {
	return fruit;
}

   
public void setFruit(Fruit fruit) {
	this.fruit = fruit;
}



public Grain getGrain() {
	return grain;
}



public void setGrain(Grain grain) {
	this.grain = grain;
}



public Meat getMeat() {
	return meat;
}



public void setMeat(Meat meat) {
	this.meat = meat;
}



public Vegetable getVeg() {
	return veg;
}



public void setVeg(Vegetable veg) {
	this.veg = veg;
}



private Dairy dairy;
   public Dairy getDairy() {
	return dairy;
}



public void setDairy(Dairy dairy) {
	this.dairy = dairy;
}




   
   
   
	public String whatsInThisMeal()
	{
		String answer="This meal contains ";
		if(fruit!=null)answer+="some fruit:";
		if(dairy!=null)answer+="some dairy:";
		if(grain!=null)answer+="some grain:";
		if(meat!=null)answer+="some meat:";
		if(veg!=null)answer+="some vegetables:";
		return answer;
		
		
	}

}




