package myjava8.module2.lambda;

interface Greetings{
    public void greet();
}
public class FirstLambda {
    public static void wish(Greetings g){
        g.greet();
    }

    public static void main(String[] args) {
//        wish(new Greetings() {
//            @Override
//            public void greet() {
//                System.out.println("hello");
//            }
//        });

        wish(
            ()-> {
                System.out.println("hi");

        });
    }
}
