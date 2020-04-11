package core.java.serialization;

import java.io.*;

/**
 * Created by U6042192 on 27-Nov-17.
 */
class One implements Serializable{
    int one=1;
}
class Two extends One implements Serializable{
    int two=2;
}
public class SerEx2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Two t=new Two();
        One t=new One();
        FileOutputStream fos=new FileOutputStream("two.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(t);

        FileInputStream fis=new FileInputStream("two.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Two t1=(Two)ois.readObject();

        System.out.println(t1.one);
        System.out.println(t1.two);
    }
}
