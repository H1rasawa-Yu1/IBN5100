package org.example;
public class test{
   static int num=0;
   test(){
       num++;
       System.out.println(num);
   }
   public static void main(String []args){
       test t1=new test();
       test t2=new test();
   }
}