package homework_5.Task_1;

public class Eagle extends FlyingBird {

    public Eagle(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Eagle is flying.");
    }

    @Override
    public String toString() {
        return "Eagle{" + this.feathers + " feathers, "+ this.layEggs + " eggs}";
    }
}
