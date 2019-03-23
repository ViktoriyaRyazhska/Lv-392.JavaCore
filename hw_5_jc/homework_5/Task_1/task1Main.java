package homework_5.Task_1;

public class task1Main {
    public static void main(String[] args) {

        Bird [] birdArray = new Bird[4];

        birdArray[0] = new Eagle("Brown", 2);
        birdArray[1] = new Swallow("Black", 4);
        birdArray[2] = new Penguin("Black and White", 3);
        birdArray[3] = new Chicken("Grey", 5);

        for (Bird i : birdArray){
            System.out.println(i);
            i.fly();
            System.out.println();
        }
    }
}
