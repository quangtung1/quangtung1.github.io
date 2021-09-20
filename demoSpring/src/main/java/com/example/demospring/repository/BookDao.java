package com.example.demospring.repository;

import com.example.demospring.model.Book;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BookDao extends Dao<Book> {

    public BookDao() {
        collections.add(new Book(1, "Không gia đình", "Chú bé Remy lang thang theo gánh xiếc của bác Vitaly"));
        collections.add(new Book(2, "Cuốn theo chiều gió", "Nội chiến Hoa kỳ, cuộc tình giữa Red Butler và Ohara"));
        collections.add(new Book(3, "Conan", "Trinh thám, phiêu lưu thám hiểm"));

    }

    @Override
    public List<Book> getAll() {
        return collections;
    }

    @Override
    public List<Book> get(int id) {

        return collections.stream().filter(b->b.getId()==id).collect(Collectors.toList());

    }

    @Override
    public void add(Book t) {
        Book book = new Book();
        book.setId(collections.size()+1);
        book.setDescription(t.getDescription());
        book.setTitle(t.getTitle());
        collections.add(book);
    }

    @Override
    public void update(Book t,int id) {
        for (Book b:collections) {
            if (b.getId()==id){

                b.setTitle(t.getTitle());
                b.setDescription(t.getDescription());

            }
        }
    }

    @Override
    public void deleteByID(int id) {
        boolean check = false;
        for (Book b :collections) {
            if (b.getId()==id){
                collections.remove(b);
                check=true;
            }
        }
        if (check== true){
            System.out.println("Delete successful");
        }else {
            System.out.println("Not found ID");
        }
    }

    @Override
    public void delete(Book t) {
        // TODO Auto-generated method stub
        boolean check = false;
        for (Book b :collections) {
            if (b.getId()==t.getId()){
                collections.remove(b);
                check=true;
            }
        }
    }
}
