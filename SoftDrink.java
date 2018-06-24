/***********************************
 * SoftDrink Class
 * SIMPHIWE MCHUNU
 * 25 AUGUST 2016
 *
 **********************************/


class SoftDrink extends Order {
  private String DrinkFlavour;
  private String Container;

  public SoftDrink(String DrinkFlavour, String Container, String ItemNumber, String size) {
    super(ItemNumber, size);
    this.DrinkFlavour = DrinkFlavour;
    this.Container = Container;
  }
  public String toString() {
    return "Soft Drink" + super.toString() + this.DrinkFlavour + ", " + this.Container;
  }
  public String getItemNumber() {
   return super.getItemNumber();
   }

}
