package interviewTest.test13;

/*
* reverse palindrome without changing the special char postion

abc.xyz-pqr => rqp.zyx-cba
/gH?yZx => /xZ?yHg
* */
public class TestEpam {
    public   static  String revSpecial(String s){
        char[] chars=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while (i<j){
            //if i,j i valid swap
            if(isValid(chars[i]) && isValid(chars[j])){
                char temp=chars[i];
                chars[i]=chars[j];
                chars[j]=temp;
                i++;
                j--;
            }
            //else if any one is invalid increment the index
            else if (!isValid(chars[i])){
                i++;
            }else {
                j--;
            }
        }
        return new String(chars);
    }
    private static boolean isValid(char ch){
        if((ch>='a' && ch<='z') || (ch>='0' && ch<=9))
            return true;
        return false;
    }
    public static void main(String[] args) {
        String s1="abc.xyz-pqr";
        String s2="/gh?yzx";
        String res1=revSpecial(s1);
        String res2=revSpecial(s2);
        System.out.println(res1);
        System.out.println(res2);
    }
}
