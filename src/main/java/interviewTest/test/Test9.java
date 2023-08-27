package interviewTest.test;

public class Test9 {
    public static void main(String[] args) {
        new ControllFlowTest();
    }
}
class ControllFlowTest{
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }

    public ControllFlowTest() {
        System.out.println("constructor");
    }
}
