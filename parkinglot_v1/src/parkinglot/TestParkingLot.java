package parkinglot;

public class TestParkingLot {

    public static void main(String[] args) {
        
        ParkingLot parking_lot =  new ParkingLot(10);
        parking_lot.addCard();
        parking_lot.addCard();
        System.out.printf("Current: %d %n", parking_lot.getCurrent());
        System.out.printf("Maximum: %d %n", parking_lot.getMaximum());
        parking_lot.removeCard();
        System.out.printf("Current: %d %n", parking_lot.getCurrent());
        System.out.printf("Maximum: %d %n", parking_lot.getMaximum());
        parking_lot.addCard();
        parking_lot.addCard();
        parking_lot.addCard();
        parking_lot.addCard();
        parking_lot.addCard();
        parking_lot.addCard();
        System.out.printf("Current: %d %n", parking_lot.getCurrent());
        System.out.printf("Maximum: %d %n", parking_lot.getMaximum());
        parking_lot.addCard();
        parking_lot.addCard();
        parking_lot.addCard();
        System.out.printf("Current: %d %n", parking_lot.getCurrent());
        System.out.printf("Maximum: %d %n", parking_lot.getMaximum());
        parking_lot.addCard();
        parking_lot.removeCard();
        parking_lot.addCard();
        System.out.printf("Current: %d %n", parking_lot.getCurrent());
        System.out.printf("Maximum: %d %n", parking_lot.getMaximum());
    }

    
}
