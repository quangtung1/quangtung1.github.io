package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Book;
import com.example.demo.model.Film;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
  @GetMapping()
  public String showHomePage(Model model) {
    model.addAttribute("name", "Quang Duy");
    return "index";
  }
  @GetMapping("about")
  public String showAboutPage(Model model) {
    model.addAttribute("name", "Quang tung");
    return "about";
  }
  @GetMapping("book")
  public String showBookPage(Model model) {
   List<Book> books = new ArrayList<Book>();
   books.add(new Book("Conan","Quang Tung"));
   books.add(new Book("Doremon","Quang Duy"));
   books.add(new Book("Tokyo Revengers","Hai Yen"));
   model.addAttribute("books", books);
   
    return "book";
  }
  @GetMapping("film")
  public String showFilmPage(Model model){
      List<Film> films= new ArrayList<Film>();
      films.add(new Film("Conan","Trinh Thám","Quang Tùng",1975));
      films.add(new Film("Doremon","Hài Hước","Quang Duy",1977));
      films.add(new Film("Tokyo Revengers","Hành Động, Bất Lương","Hải Yến",2019));
      films.add(new Film("One Piece","Phiêu Lưu","Quang Mạnh",1999));
      films.add(new Film("7 Viên Ngọc Rồng","Phiêu Lưu","Quang Bảo",1975));
      model.addAttribute("films", films);
      return "film";

  }
}