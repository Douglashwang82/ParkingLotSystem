package parkinglot.model;

public class Address {
    String street;
    String block;
    String city;
    String state;
    String country;

    public Address(String street, String block, String city, String state, String country) {
        this.street = street;
        this.block = block;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBlock() {
        return this.block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
}
