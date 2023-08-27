package interview.oops;

public class StringEx1 {
    public static void main(String[] args) {
        //equals is over ridden in String class
//        String s1= "A";
//        String s2= "A";
        String s1= new String("A");
        String s2= new String("A");

        System.out.println("==: "+s1==s2);
        System.out.println("equls: "+s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
