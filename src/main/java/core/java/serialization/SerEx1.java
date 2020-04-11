package core.java.serialization;

import java.io.*;

/**
 * Created by U6042192 on 27-Nov-17.
 */
class Dog implements Serializable{
    int a=10;
    static transient int b=20;
}
public class SerEx1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog d=new Dog();
        FileOutputStream fos=new FileOutputStream("dog.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);
        fos.close();

        FileInputStream fis=new FileInputStream("dog.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d1=(Dog)ois.readObject();

        System.out.println(d1.a);
        System.out.println(d1.b);
        fis.close();

        File f=new File("dog.ser");
        f.delete();


    }
}
