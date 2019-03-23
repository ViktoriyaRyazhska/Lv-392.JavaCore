package homework_5.Task_1;

public class Chicken extends NonFlyingBird {

    public Chicken(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Chicken isn't flying.");
    }

    @Override
    public String toString() {
        return "Chicken{" + this.feathers + " feathers, "+ this.layEggs+ " eggs}";
    }
}
