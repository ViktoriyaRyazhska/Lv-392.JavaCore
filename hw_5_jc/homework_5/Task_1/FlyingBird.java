package homework_5.Task_1;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    public void fly(){
        System.out.print("Flying bird can fly. ");
    }
}
