package core.java.serialization;

import java.io.*;

/**
 * Created by U6042192 on 27-Nov-17.
 */
class Robot implements Externalizable{
    int id;
    String name;
    transient int serNo;

    public Robot() {
    }

    public Robot(int id, String name, int serNo) {
        this.id = id;
        this.name = name;
        this.serNo = serNo;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(serNo);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name= (String) in.readObject();
        serNo=in.readInt();
    }
}
public class ExtEx1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Robot r=new Robot(1,"mitra",12100);

        FileOutputStream fos=new FileOutputStream("robot.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(r);


        FileInputStream fis=new FileInputStream("robot.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Robot r1= (Robot) ois.readObject();

        System.out.println(r1.name+" "+r1.serNo);

    }
}
