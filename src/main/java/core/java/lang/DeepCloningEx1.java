package core.java.lang;

/**
 * Created by U6042192 on 28-Nov-17.
 */
class Shelf implements Cloneable{
    int id;
    Book b;

    public Shelf(int id, Book b) {
        this.id = id;
        this.b = b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book b=new Book(this.b.bookName);
        Shelf s=new Shelf(this.id,b);
        return s;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "id=" + id +
                ", b=" + b +
                '}';
    }
}
public class DeepCloningEx1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shelf s1=new Shelf(1,new Book("hadoop"));
        System.out.println(s1);

        Shelf s2= (Shelf) s1.clone();
        s1.b.bookName="java";
        System.out.println(s2);
    }
}
