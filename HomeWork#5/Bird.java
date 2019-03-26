package myPack;
public abstract class Bird {
	static String feathers;
    static String layEggs;
	abstract void fly();
	public static void main(String[] args) {
		Bird b [] = new Bird[4];
		b[0] = new Eagle(feathers,layEggs);
		b[1] = new Swallow(feathers,layEggs);
		b[2] = new Penguin(feathers, layEggs);
		b[3] = new Chicken(feathers, layEggs);
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i].getClass().getSimpleName()+" - ");
            b[i].fly();  
		}
	}
	Bird(String feathers,String layEggs){
		Bird.feathers = feathers;
		Bird.layEggs = layEggs;
		}
	String getfeathers() {
		return feathers;
	}
	String getlayEggs() {
		return layEggs;
	}
	void setfeathers(String feathers) {
		Bird.feathers = feathers;
	}
	void setlayEggs(String layEggs) {
		Bird.layEggs = layEggs;
	}
}
class FlyingBird extends Bird{
	FlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}
	void fly() {
		 System.out.println("Flying");
	 }
    }
class NonFlyingBird extends Bird{
    NonFlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);	
	}

	void fly() {
    	System.out.println("NonFlying");
    }
	}
class Eagle extends FlyingBird{
	Eagle(String feathers, String layEggs) {
		super(feathers, layEggs);
	}
}
class Swallow extends FlyingBird{
	Swallow(String feathers, String layEggs) {
		super(feathers, layEggs);
	}
}
class Penguin extends NonFlyingBird{
	Penguin(String feathers, String layEggs) {
	    super(feathers, layEggs);
	}
}
class Chicken extends FlyingBird{
    Chicken(String feathers, String layEggs) {
		super(feathers, layEggs);	
	}
}


	


