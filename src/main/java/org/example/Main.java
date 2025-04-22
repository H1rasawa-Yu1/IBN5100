package org.example;
interface Animal{
    int age=1;
    String name="cz";
    void shout();
    public void info();
    static int getAge() {
        return age;
    }
}
interface Action{
    public void eat();
}
class Dog implements Animal,Action{
    public void eat(){
        System.out.println("dog eat");
    }
    public void info(){
        System.out.println("dog info");
    }
    public void shout(){
        System.out.println("dog shout");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.info();
        dog.eat();
        dog.shout();
    }
}