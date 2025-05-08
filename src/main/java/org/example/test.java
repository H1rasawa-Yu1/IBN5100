package org.example;
public class test{
    String name;
    int age;
    static String sch="zut";
    public test(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
class Main{
    public static void main(String []args){
        test t1=new test("yui",18);
        test t2=new test("saki",18);
        System.out.println(t1.getName());
        System.out.println(test.sch);
    }
}