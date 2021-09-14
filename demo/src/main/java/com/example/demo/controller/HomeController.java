package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Book;
import com.example.demo.model.Film;

import com.example.demo.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

  /*@GetMapping("book")
  public ResponseEntity<List<Book>> getBook(){
      return ResponseEntity.ok().body(List.of(
              books.add(new Book("Conan","Quang Tung"));
      books.add(new Book("Doremon","Quang Duy"));
      books.add(new Book("Tokyo Revengers","Hai Yen"));
      ))
  }*/
  @GetMapping("film")
  public ResponseEntity<List<Film>> getFilm(){
      return ResponseEntity.ok().body(List.of((new Film("Conan","Trinh Thám","Quang Tùng",1975)),
      (new Film("Doremon","Hài Hước","Quang Duy",1977)),
      (new Film("Tokyo Revengers","Hành Động, Bất Lương","Hải Yến",2019)),
      (new Film("One Piece","Phiêu Lưu","Quang Mạnh",1999)),
      (new Film("7 Viên Ngọc Rồng","Phiêu Lưu","Quang Bảo",1975))));
  }
    @Autowired
    PersonRepo repo;
@GetMapping("/peoplebyage")
  public void getPeoplebyAge(){
      repo.getPeoplebyAge();
  }
    @GetMapping("/avg")
    public void avg(){
        repo.avgAge();
    }
    @GetMapping("/avgbyage")
    public void avgbycon(){
        repo.avgAgebyCon();
    }





}