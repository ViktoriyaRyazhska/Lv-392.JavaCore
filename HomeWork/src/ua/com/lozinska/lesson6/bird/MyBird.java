package ua.com.lozinska.lesson6.bird;

public class MyBird {
    public static void main(String[] args) {

        Bird[] myBird = new Bird[6];
        myBird[0] = new Swallow();
        myBird[1] = new Penguin();
        myBird[2] = new Chicken();
        myBird[3] = new Swallow();
        myBird[4] = new Eagle();
        myBird[5] = new Chicken();

        for (int i = 0; i <myBird.length ; i++) {
            System.out.print("Hi, I am "+ myBird[i].getClass().getSimpleName() + ". " );
            myBird[i].fly();

        }

    }
}
