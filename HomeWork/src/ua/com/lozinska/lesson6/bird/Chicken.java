package ua.com.lozinska.lesson6.bird;

public class Chicken extends NonFlyingBird {
    @Override
    void fly(){
        System.out.println("I am not flying.");}
}
