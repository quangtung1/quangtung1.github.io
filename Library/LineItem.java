package Library;

import java.util.List;

public class LineItem {
    @Override
    public String toString() {
        return "LineItem [amount=" + amount + ", " + book  + "]";
    }
    private long id;
    private int amount;
    private Book book;
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public LineItem(int amount, Book book) {
        this.amount = amount;
        this.book = book;
    }

}
