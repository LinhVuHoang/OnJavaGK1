package BookingRoom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookingRoom objBookingRoom = new BookingRoom();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter check in date (mm dd yyyy): ");
        byte day = s.nextByte();
        byte month = s.nextByte();
        short year = s.nextShort();
        objBookingRoom.setBookingDate(day,month,year);
        Time objTime = new Time();
        System.out.println("Enter check in time (hh mm)");
        objTime.hours = s.nextByte();
        objTime.minutes = s.nextByte();
        objBookingRoom.setCheckInTime(objTime);
        System.out.println("Enter the type of room: \n1. Single\n2. Double\3. Twin\n");
        objBookingRoom.typeOfRoom = s.nextByte();
        System.out.println("Enter the number of rooms: ");
        objBookingRoom.noOfRooms = s.nextByte();
        objBookingRoom.displayTicketInformation();

    }
}
