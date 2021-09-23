package com.example.demothymleaf.controller;

import com.example.demothymleaf.model.Car;
import com.example.demothymleaf.repository.CarDAO;
import com.example.demothymleaf.repository.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @PutMapping("update/{id}")
    public ResponseEntity update(@PathVariable int id,@RequestBody Car cars){


        return ResponseEntity.ok(carDAO.update(cars,id));
    }
    @GetMapping("delete/{id}")
    public ResponseEntity delete( @PathVariable int id){

        return ResponseEntity.ok(carDAO.delete(id));
    }
    @GetMapping("/search")
    public ResponseEntity search(@RequestParam String modell,@RequestParam String m){

       return ResponseEntity.ok(carDAO.search(modell, m));
    }
    @GetMapping("/sort")
    public String sort(Model model){
       model.addAttribute("car",carDAO.sort());
       return "listcar";
    }
}
