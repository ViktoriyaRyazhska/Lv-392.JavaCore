package homework_5.Task_1;

public class Swallow extends FlyingBird{

    public Swallow(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Swallow is flying.");
    }

    @Override
    public String toString() {
        return "Swallow{" + this.feathers + " feathers, "+ this.layEggs+ " eggs}";
    }
}
