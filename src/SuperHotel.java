/*class Hotelx {
    public int bookings;
    public void book() {
        bookings++;
    }
}

public class SuperHotel extends Hotelx{
    public void book() {
        bookings--;
    }
    
    public void book(int size) {
        book();
        super.book();
        bookings += size;
    }
    
    public static void main(String args[]) {
        Hotelx hotel = new SuperHotel();
        //hotel.book(21);//cannot call a overloaded subclass function from a base class refrence,only overridden
        
        SuperHotel x=new SuperHotel();
        x.book(21);//nas 21
        System.out.print(hotel.bookings);
    }
}*/

