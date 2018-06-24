/*********************************
 * Pizza Class
 * SIMPHIWE MCHUNU
 * 25 AUGUST 2016
 *
 *********************************/

class Pizza extends Order {
  private String Cheese;
  private String Base;
  private String Garlic;

  public Pizza(String Cheese,String Base, String Garlic, String ItemNumber, String Size) {
    super(ItemNumber, Size);
    this.Cheese = Cheese;
    this.Base = Base;
    this.Garlic = Garlic;

  }
   public String toString() {
      return "Pizza" + super.toString() + this.Base + ", " + this.Cheese + ", " + this.Garlic;
  }
  public String getItemNumber() {
    return super.getItemNumber();
    }
}
