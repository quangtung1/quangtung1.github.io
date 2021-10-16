package com.example.crud.controller;

import java.util.Optional;
import com.example.crud.repository.StaffDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.crud.model.Staff;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    StaffDao staffDao;

    @GetMapping("")
    public String getAll(Model model) {
        model.addAttribute("staffs", staffDao.getAll());
        return "allStaff";
    }

    @GetMapping(value = "/{id}")
    public String getByID(@PathVariable("id") long id, Model model) {
        Optional<Staff> staff = staffDao.get(id);
        if (staff.isPresent()) {
            model.addAttribute("staff", staff.get());
        }
        return "staff";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("staff", new Staff());
        return "form";
    }

    @PostMapping("/save")
    public String save(Staff staff, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        if (staff.getId() > 0) {
            staffDao.update(staff);
        }
        staffDao.add(staff);
        return "redirect:/staff";
    }

    @GetMapping(value = "/edit/{id}")
    public String editBookId(@PathVariable("id") int id, Model model) {
        Optional<Staff> staff = staffDao.get(id);
        if (staff.isPresent()) {
            model.addAttribute("staff", staff.get());
        }
        return "form";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteByID(@PathVariable("id") int id) {
        staffDao.deleteByID(id);
        return "redirect:/staff";
    }
}
