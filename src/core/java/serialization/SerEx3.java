package core.java.serialization;

import com.ds.array.ArrayRotatedSortedEx1;

import java.io.*;

/**
 * Created by U6042192 on 27-Nov-17.
 */
class Account implements Serializable{
    String username="abc";
    String pwd="xyz";

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        String epwd="123"+pwd;
        oos.writeObject(epwd);
    }
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        String pwd= (String) ois.readObject();
        //pwd=epwd.substring(3);
    }
}
public class SerEx3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account a= new Account();
        FileOutputStream fos=new FileOutputStream("acc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a);

        FileInputStream fis=new FileInputStream("acc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account a2=(Account)ois.readObject();

        System.out.println(a2.username+" "+a2.pwd);

    }
}
