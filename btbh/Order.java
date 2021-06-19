package btbh;

import java.time.LocalDateTime;
import java.util.List;

public class Order implements Enitity{
    @Override
  public String toString() {
    return "Order [customer=" + customer +  ", items=" + items + ", notes=" + notes + ", orderDate="
        + orderDate + "]";
  }
    private Long id;
    private Customer customer;
    private LocalDateTime orderDate;
    private String notes; //Ghi chú khi đặt hàng
    private List<Linelitem> items; //chi tiết từng mặt hàng trong đơn hàng
    @Override
    public Long getId() {
      return id;
    }
    
    public Order(Customer customer, LocalDateTime orderDate, String notes, List<Linelitem> items) {
      this.customer = customer;
      this.orderDate = orderDate;
      this.notes = notes;
      this.items = items;
    }
    public Customer getCustomer() {
      return customer;
    }
    public void setCustomer(Customer customer) {
      this.customer = customer;
    }
    public LocalDateTime getOrderDate() {
      return orderDate;
    }
    public void setOrderDate(LocalDateTime orderDate) {
      this.orderDate = orderDate;
    }
    public String getNotes() {
      return notes;
    }
    public void setNotes(String notes) {
      this.notes = notes;
    }
    public List<Linelitem> getItems() {
      return items;
    }
    public void setItems(List<Linelitem> items) {
      this.items = items;
    }
}
