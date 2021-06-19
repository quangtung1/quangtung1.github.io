package btbh;

public class Linelitem implements Enitity{
    @Override
  public String toString() {
    return "Linelitem [" + "Product:" + product + "quantity=" + quantity + ", unitPrice=" + unitPrice + "] \n";
  }

    private Long id; //Unique id  
  private Integer unitPrice;
  private Integer quantity;
  private Product product;
  
  @Override
  public Long getId() {
    return id;
  }

  public Integer getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Linelitem(Product product, Integer unitPrice, Integer quantity) {
    this.unitPrice = unitPrice;
    this.product= product;
    this.quantity = quantity;
  }
}
