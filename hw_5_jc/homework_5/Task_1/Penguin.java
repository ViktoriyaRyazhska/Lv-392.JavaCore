package homework_5.Task_1;

public class Penguin extends NonFlyingBird {

    public Penguin(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Penguin isn't flying.");
    }

    @Override
    public String toString() {
        return "Penguin{" + this.feathers + " feathers, "+ this.layEggs+ " eggs}";
    }
}
