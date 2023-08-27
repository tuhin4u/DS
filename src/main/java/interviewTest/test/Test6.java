package interviewTest.test;

public class Test6 {
    public static void main(String[] args) {
        showDetailsYearwise(30000.00,25, 10.0);
    }
    public static void showDetailsYearwise(Double intallment,int y,Double r){
        double p=0;
        for (int i = 1; i <=y ; i++) {
            double interest=p*(r/100);
            p=p+intallment+interest;
            System.out.println("Year = "+i+" amount = "+p);

        }
        double sum=p;
        System.out.println("--no pay period--");
        for (int i = 0; i <10 ; i++) {
            double interest=p*(r/100);
            sum=sum+interest;
            System.out.println("Year = "+(y++)+" amount = "+sum);
        }
    }
}
