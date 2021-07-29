package vn.techmaster.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.techmaster.model.Book;

@Controller
@RequestMapping("/")
public class Homecontroller {
    @GetMapping()
    public String showHomePage(Model model){
       model.addAttribute("name", "Bill Gate");
        return "index";
    }
    @GetMapping("about")
    public String showAboutPage(Model model){
        model.addAttribute("name", "Quang Tung");
        return "about";
    }
    @GetMapping("books")
    public String listBooks(Model model){
List<Book> books = List.of(new Book("Dế mèn phiêu lưu kí", "Tô Hoài"),new Book("Nhậ ký trong tù","Hồ Chí Minh"),new Book("Conan","Quang Duy"));
model.addAttribute("books", books);
return "book";
    }
}
