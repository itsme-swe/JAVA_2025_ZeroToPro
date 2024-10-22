package OOPs.ProductClass;

public class Product {

  private String itemNum;
  private String name;
  private double price;
  private short quantity;

  public String getItemNum() {
    return itemNum;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public short getQuantity() {
    return quantity;
  }

  public void setPrice(double p) {
    price = p;
  }

  public void setQuantity(short q) {
    quantity = q;
  }

}
