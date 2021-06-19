package Library;
public class Book{
    @Override
    public String toString() {
        return "Book [YOM=" + YOM + ", author=" + author + ", bookname=" + bookname + ", category=" + category + ", id Book="
                + id + ", pagenumber=" + pagenumber + ", producer=" + producer + "] \n";
    }
    private long id;
    private String bookname;
    private String category;
    private String author;
    private int YOM;
    private String producer;
    private int pagenumber;
    public Book(String bookname, String category, String author, int YOM, String producer, int pagenumber) {
        id=Idgenerator.getNewIDBook();
        this.bookname = bookname;
        this.category = category;
        this.author = author;
        this.YOM = YOM;
        this.producer = producer;
        this.pagenumber = pagenumber;
    }
   
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYOM() {
        return YOM;
    }
    public void setYOM(int yOM) {
        YOM = yOM;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public int getPagenumber() {
        return pagenumber;
    }
    public void setPagenumber(int pagenumber) {
        this.pagenumber = pagenumber;
    }
    
    
}