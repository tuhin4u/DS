package core.java.lang;

public class InternEx {
    public static void main(String[] args) {
        String s1="cat";
        String s2="cat";
        System.out.println(s1==s2);
        String s3=new String("cat");
        System.out.println(s1==s3);
        String s4=s3.intern();// refering to string constant pool
        System.out.println(s1==s4);

    }
}
