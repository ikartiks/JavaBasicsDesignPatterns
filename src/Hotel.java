/*public class Hotel {
    
    public static void book(short a) {
        System.out.print("short ");
    }
    
    public static void book(Short a) {
        System.out.print("SHORT ");
    }
    
    public static void book(Long a) {
        System.out.print("LONG ");
    }
    
    public static void main(String[] args) {
        short shortRoom = 1;
        int intRoom = 2;
        
        book(shortRoom);
        //book(intRoom);//comlilation fails
    }
}*/

import java.io.*;

/*public class Hotel implements Serializable {
    private transient Room room = new Room();
    
    public static void main(String[] args) {
        Hotel h = new Hotel();
        try {
            FileOutputStream fos = new FileOutputStream("Hotel.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(h);
            oos.close();
            
            //only hotel is serialized
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Room {
}*/

/*import java.io.*;

public class Hotel implements Serializable {
    private Room room = new Room();
    
    public static void main(String[] args) {
        Hotel h = new Hotel();
        try {
            FileOutputStream fos = new FileOutputStream("Hotel.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(h);
            oos.close();
            
            //java.io.NotSerializableException: Room
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Room {
}*/

public class Hotel  {
    
    private static void book() {
        System.out.print("book");
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1);
        book();
    }
}

