package test;

class Parent{
    public static void fn(long l){
        System.out.println("widening");
    }
    public static void fn(Integer l){
        System.out.println("autoboxing");
    }
}
//class Child extends Parent{}
public class test14 {
    public static void main(String[] args) {
        Integer a=10;
        Parent.fn(null);
    }
}
