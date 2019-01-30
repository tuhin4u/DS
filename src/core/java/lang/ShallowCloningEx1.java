package core.java.lang;

/**
 * Created by U6042192 on 28-Nov-17.
 */
class Book{
    String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}
class Library implements Cloneable{
    int id;
    Book b;

    public Library(int id, Book b) {
        this.id = id;
        this.b = b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", b=" + b +
                '}';
    }
}
public class ShallowCloningEx1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Library lib1=new Library(1,new Book("Hadoop"));
        System.out.println(lib1);


        Library lib2=(Library)lib1.clone();
        lib1.b.bookName="java";
        System.out.println(lib2);

    }
}
