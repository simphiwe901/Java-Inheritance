/********************************
 * VEHICLE CLASS
 * SIMPHIWE MCHUNU
 * 25 AUGUST 2016
 ********************************/


public class Vehicle {
    private int no_of_Passengers;
    private String colour;

    Vehicle(int no_of_Passengers, String colour) {
        this.no_of_Passengers = no_of_Passengers;
        this.colour = colour;
    }

    public String toString() {return colour + " " + no_of_Passengers + " passengers";}
}
