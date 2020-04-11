package test;

public class TestObjectCreationEx {
    public static void main(String[] args) {
        Child2 c=new Child2();

    }
}
class Parent2{
    public Parent2() {
        System.out.println("parent "+this.hashCode());
    }
}
class Child2 extends Parent2{
    public Child2() {
        System.out.println("child "+this.hashCode());
    }
}