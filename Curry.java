/******************************
 * Curry class
 * SIMPHIWE MCHUNU
 * 25 AUGUST 2016
 *
 ******************************/

class Curry extends Order {
  private String CurryType;

  public Curry(String type, String ItemNum, String size) {
    super(ItemNum, size);
    this.CurryType = type;
  }
  public String toString() {
    return "Curry" + super.toString() + this.CurryType;
  }
  public String getItemNumber()
   {
      return super.getItemNumber(); }
}
