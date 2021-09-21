package com.example.demothymleaf.controller;

import com.example.demothymleaf.model.Car;
import com.example.demothymleaf.repository.CarDAO;
import com.example.demothymleaf.repository.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/car")
public class HomeController {

   CarDAO carDAO;
   public  HomeController(){
       carDAO = new CarDAO();
   }
    @GetMapping("/show")
    public String getAll(Model model){
        List<Car> car = carDAO.getAll();
        model.addAttribute("listcar",car);
        return "listcar";
    }
    @GetMapping("/create")
    public String create (Model model, Car cars){
        model.addAttribute("car",carDAO.create(cars));

        return "listcar";
    }
    @GetMapping("update/{id}")
    public String update(Model model, @PathVariable int id,Car cars){
        model.addAttribute("car",carDAO.update(cars,id));

        return "listcar";
    }
    @GetMapping("delete/{id}")
    public String update(Model model, @PathVariable int id){
        model.addAttribute("car",carDAO.delete(id));
        return "listcar";
    }
    @GetMapping("/search")
    public String search(Model model,String modell, String m){
       model.addAttribute("car",carDAO.search(modell,m));
       return "listcar";
    }
    @GetMapping("/sort")
    public String sort(Model model){
       model.addAttribute("car",carDAO.sort());
       return "listcar";
    }
}
