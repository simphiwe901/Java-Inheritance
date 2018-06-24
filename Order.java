/******************************
 * Order class
 * SIMPHIWE MCHUNU
 * 25 AUGUST 2016
 *
 ******************************/

class Order {
  private String ItemNumber;
  private String Size;

  public Order(String ItemNumber, String size) {
    this.ItemNumber = ItemNumber;
    this.Size = size;
  }
  public String toString() {
    return ": " + this.ItemNumber + ", " + this.Size + ", ";
  }
  public String getItemNumber()
   { return ItemNumber;
  }
}
