package Library;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add( new Book("Conan","Trinh tham","Quang Tung",1969,"Kim Dong",244));
        books.add( new Book("Doremon","Hai huoc","Hai Yen",1958,"Japan",265));
        books.add( new Book("One Piece","Phieu luu","Quang Duy",1999,"Viet Nam",352));
       for (Book book :books){
           System.out.println(book);
       }
       List<Reader> readers = new ArrayList<>();
       readers.add(new Reader("Quang Tung","tung@gmail.com","0387785580","Nam Dinh"));
       readers.add(new Reader("Hai Yen","yen@gmail.com","0387462222","Bac Kan"));
       readers.add(new Reader("Quang Duy","duy@gmail.com","0387785555","Nam Dinh"));
       for(Reader reader : readers){
           System.out.println(reader);
       }
       Book book1 = new Book("Conan","Trinh tham","Quang Tung",1969,"Kim Dong",244);
       Book book2=new Book("Doremon","Hai huoc","Hai Yen",1958,"Japan",265);
       Book book3=new Book("One Piece","Phieu luu","Quang Duy",1999,"Viet Nam",352);
       Reader reader1=new Reader("Quang Tung","tung@gmail.com","0387785580","Nam Dinh");
       Reader reader2=new Reader("Hai Yen","yen@gmail.com","0387462222","Bac Kan");
       Reader reader3=new Reader("Quang Duy","duy@gmail.com","0387785555","Nam Dinh");
       List<LineItem> lists= new ArrayList<>();
       lists.add( new LineItem(2, book1));
       lists.add( new LineItem(3, book2));
       lists.add( new LineItem(4, book3));
       for (LineItem lineItem : lists){
           System.out.println(lineItem);
       }
       Voucher voucher = new Voucher(reader1,LocalDate.of(2018, Month.JANUARY, 24),LocalDate.of(2019, Month.AUGUST, 4),lists);
System.out.println(voucher);
}
}
