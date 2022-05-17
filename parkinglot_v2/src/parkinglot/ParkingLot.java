package parkinglot;

import parkinglot.model.Address;
import parkinglot.model.ParkingSlotType;
import parkinglot.model.Ticket;
import parkinglot.model.Vehicle;

import java.util.List;
import java.util.Map;

public class ParkingLot {
    private String nameOfParkingLot;
    private Address address;
    private List<ParkingFloor> parkingFloors;
    private static ParkingLot parkinglot = null;

    private ParkingLot(String nameOfParkingLot, Address address, List<ParkingFloor> parkingFloors) {
        this.nameOfParkingLot = nameOfParkingLot;
        this.address = address;
        this.parkingFloors = parkingFloors;
    }

    public static ParkingLot getInstance(String nameOfParkingLot, Address address, List<ParkingFloor> parkingFloors) {
        if (parkinglot == null) {
            parkinglot = new ParkingLot(nameOfParkingLot, address, parkingFloors);
        }
        return parkinglot;
    }

    public void addFloors(String name, Map<ParkingSlotType, Map<String, ParkingSlot>> parkSlots) {
        ParkingFloor parkingFloor = new ParkingFloor(name, parkSlots);
        parkingFloors.add(parkingFloor);
    }

    public void removeFloors(ParkingFloor parkingFloor) {
        parkingFloors.remove(parkingFloor);
    }

    public Ticket assignTicket(Vehicle vehicle) {
        ParkingSlot parkingSlot = getParkingSlotForVehicleAndPark(vehicle);
        if (parkingSlot == null)
            return null;
        Ticket parkingTicket = createTicketForSlot(parkingSlot, vehicle);
        return parkingTicket;
    }

    public double scanAndPay(Ticket ticket) {
        long endTime = System.currentTimeMillis();
        ticket.getParkingSlot().removeVehicle(ticket.getVehicle());
        int duration = (int) (endTime - ticket.getStartTime()) / 1000;
        double price = ticket.getParkingSlot().getParkingSlotType().getPriceForParking(duration);
        return price;
    }

    private Ticket createTicketForSlot(ParkingSlot parkingSlot, Vehicle vehicle) {
        return Ticket.createTicket(vehicle, parkingSlot);
    }

    private ParkingSlot getParkingSlotForVehicleAndPark(Vehicle vehicle) {
        ParkingSlot parkingSlot = null;
        for (ParkingFloor floor : parkingFloors) {
            parkingSlot = floor.getRelevantSlotForVehicleAndPark(vehicle);
            if (parkingSlot != null)
                break;
        }
        return parkingSlot;
    }


    public String getNameOfParkingLot() {
        return this.nameOfParkingLot;
    }

    public void setNameOfParkingLot(String nameOfParkingLot) {
        this.nameOfParkingLot = nameOfParkingLot;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return this.parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

}
