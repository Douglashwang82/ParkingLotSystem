package parkinglot;

public class ParkingLot {
    private int current;
    private int maximum;

    public ParkingLot(int maximum){
        this.maximum = maximum;
    }
    
    public int getCurrent() {
        return current;
    }

    public int getMaximum() {
        return maximum;
    }
    public void setCurrent(int current) {
        this.current = current;
    }
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public void addCard() {
        if (current < maximum){
            current += 1;
            System.out.println("Success: add a car.");
        } else {
            System.out.println("Fail: add a car.");
        }
    }

    public void removeCard() {
        if(current > 0) {
            current -= 1;
            System.out.println("Success: remove a card.");
        } else {
            System.out.println("Fail: will below zero.");
        }
    }

}
