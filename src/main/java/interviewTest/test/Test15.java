package interviewTest.test;
class Parent1{
    int add(int a){return 0;}
    float add(float a){return 1f;}
}
class Child1 extends Parent1{
    @Override
    int add(int a) {
        super.add(1);
        return 1;
    }
}
public class Test15 {
    public static void main(String[] args) {
        Parent1 p=new Child1();
        int i=((Parent1)p).add(1);
        System.out.println(i);
    }
}
