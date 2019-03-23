package homework_5.Task_1;

public class NonFlyingBird extends Bird{

    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    public void fly(){
        System.out.print("Not flying bird can't fly. ");
    }
}
