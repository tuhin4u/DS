package myjava8.module2.defaultex;

//@FunctionalInterface
interface MyInterface{
    public abstract void fn1();
    public default void fn2(){
        System.out.println("interface fn2");
    }
    public static void fn3(){
        System.out.println("interface fn3");
    }


}
public class DefaultEx2 implements MyInterface{
    public static void main(String[] args) {
//        MyInterface i=new DefaultEx2();
//        i.fn1();
//        i.fn2();
//        MyInterface.fn3();
//        MyInterface i=new MyInterface() {
//            @Override
//            public void fn1() {
//                System.out.println("from fn1");
//            }
//        };
        MyInterface i=()-> System.out.println("from fn1");
        i.fn1();


    }

    @Override
    public void fn1() {
        System.out.println("class fn1");
    }
}
