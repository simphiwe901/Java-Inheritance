/********************************
 * CAR CLASS
 * SIMPHIWE MCHUNU
 * 26 AUGUST 2016
 *
 ********************************/

public class Car extends Vehicle {
  private int door;

  public Car(String colour, int passengers, int door) {
  super(passengers, colour);
  this.door = door;
  }

  public String toString() {return super.toString() + " "+door+" "+"doors";}
}
