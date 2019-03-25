package ua.com.lozinska.lesson6.bird;

abstract class NonFlyingBird extends Bird {
    @Override
    void fly() {
        System.out.println("I am not flying bird.");
    }
}
