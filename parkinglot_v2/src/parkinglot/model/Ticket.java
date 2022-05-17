package parkinglot.model;
import parkinglot.ParkingSlot;

public class Ticket {
    String ticketNumber;
    long startTime;
    long endTime;
    Vehicle vehicle;
    ParkingSlot parkingSlot;

    public static Ticket createTicket(Vehicle vehicle, ParkingSlot parkingSlot){
        Ticket newTicket = new Ticket();
        newTicket.setParkingSlot(parkingSlot);
        newTicket.setVehicle(vehicle);
        newTicket.setStartTime(System.currentTimeMillis());
        newTicket.setTicketNumber(vehicle.getVehicleNumber() + System.currentTimeMillis());
        return newTicket;
    }

    public String getTicketNumber() {
        return this.ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return this.parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

}
