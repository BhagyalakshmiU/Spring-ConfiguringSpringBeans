package food;


public class Meal
{
   private Grain grain;
   private Meat meat;
   private Vegetable veg;
   private Fruit fruit;
   private Dairy dairy;


   public Meal() {}

public Meal (Fruit f,Dairy d,Grain g,Meat m,Vegetable v) 
{
	this.fruit=f;
	this.meat=m;
	this.veg=v;
	this.grain=g;
	this.dairy=d;
}
public void setFruit(Fruit fruit) {
	this.fruit = fruit;
}
public Fruit getFruit() {
	return fruit;
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




   public Dairy getDairy() {
	return dairy;
}



public void setDairy(Dairy dairy) {
	this.dairy = dairy;
}




   
   
   
	public String whatsInThisMeal()
	{
		String answer="This meal contains ::";
		if(fruit!=null)answer+=fruit.talkAboutYourself()+"\n";
		if(dairy!=null)answer+=dairy.talkAboutYourself()+"\n";
		if(grain!=null)answer+=grain.talkAboutYourself()+"\n";
		if(meat!=null)answer+=meat.talkAboutYourself()+"\n";
		if(veg!=null)answer+=veg.talkAboutYourself()+"\n";
		return answer;
		
		
	}

}




