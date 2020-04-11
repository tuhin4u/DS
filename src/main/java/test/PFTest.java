package test;

public class PFTest {
    public static void main(String[] args) {
        int year=20;
        double amount=0;
        for (int i = 1; i <= year; i++) {
            amount=amount+150000+(amount+150000)*0.08;
            System.out.println("year: "+i+" amount: "+amount);
        }
//        System.out.println(1000000.00);
    }
}
