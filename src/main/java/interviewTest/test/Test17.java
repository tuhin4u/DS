package interviewTest.test;

public class Test17 {
    public static void main(String[] args) {
        int A[]={3,7};
        int B[]={4,1};
        int result=13;
        getCombination(A,B,2);
    }
    public static int getCombination(int A[],int B[],int N){
        double result=0;
        for (int i=0;i<N;i++){
            result+=Math.sqrt(A[i]* A[i] + B[i] * B[i]);
        }
        int n= (int) Math.ceil(result);
        System.out.println(result);
        System.out.println(n);

        return 0;
    }
}
