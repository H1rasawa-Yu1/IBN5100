package org.example;
public class test{
    String name;
    int age;
    static String sch="zut";
    test(String name,int age){
        this.name=name;
        this.age=age;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    static void change(){
        sch="lab";
    }
    void out(){
        System.out.println(name+","+age+","+sch);
    }
    public static void main(String[] args){
        test.change();
        test t1=new test("yui",18);
        test t2=new test("saki",18);
        t1.out();
        t2.out();
    }
}