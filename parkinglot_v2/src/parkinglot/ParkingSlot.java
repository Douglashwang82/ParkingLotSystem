package parkinglot;

import parkinglot.model.ParkingSlotType;
import parkinglot.model.Vehicle;



public class ParkingSlot {
    String name;
    boolean isAvailable = true;
    Vehicle vehicle;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsAvailable() {
        return this.isAvailable;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlotType getParkingSlotType() {
        return this.parkingSlotType;
    }

    public void setParkingSlotType(ParkingSlotType parkingSlotType) {
        this.parkingSlotType = parkingSlotType;
    }
    ParkingSlotType parkingSlotType;

    public ParkingSlot(String name, ParkingSlotType parkingSlotType) {
        this.name = name;
        this.parkingSlotType = parkingSlotType;
    }

    protected void addVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isAvailable=false;
    }

    protected void removeVehicle(Vehicle vehicle){
        this.vehicle=null;
        this.isAvailable=true;
    }
}