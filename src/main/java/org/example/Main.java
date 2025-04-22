package org.example;
abstract class Animal{
    abstract void shout();
}
class Dog extends Animal{
    void shout(){
        System.out.printf("wolf");
    }
}
public class Main{
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.shout();
    }
}