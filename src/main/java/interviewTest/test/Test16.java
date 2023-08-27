package interviewTest.test;

import java.util.HashMap;

class Pair{
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Pair p=(Pair) obj;
        if((this.x==p.x && this.y==p.y) || (this.x==p.y && this.y==p.x))
            return true;

        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
public class Test16 {
    public static void main(String[] args) {
        HashMap<Pair,Integer> map=new HashMap<>();
        map.put(new Pair(1,2),1);
        map.put(new Pair(1,2),1);

        System.out.println(map.size());
    }
}
