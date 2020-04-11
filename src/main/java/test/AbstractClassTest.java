package test;

abstract class Abstract1{
    int x;

    public Abstract1() {
        System.out.println("abstract class constructor");
    }
}
class Child3 extends Abstract1{
    public Child3() {
        System.out.println("Child class constructor");
    }
}

public class AbstractClassTest {
    public static void main(String[] args) {
        Child3 c=new Child3();
    }
}
