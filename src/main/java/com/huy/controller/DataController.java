package com.huy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.huy.domain.Data;
import com.huy.service.DataService;

@Controller
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/366026593")
    public String index(Model model) {
        model.addAttribute("datas", dataService.findAll());
        return "data_list";
    }
    
    @GetMapping("/366026593/create")
    public String create(Model model) {
        model.addAttribute("data", new Data());
        return "data_form";
    }
    
    @GetMapping("/366026593/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("data", dataService.findOne(id));
        return "data_form";
    }
    
    @PostMapping("/366026593/save")
    public String save(@Valid Data data, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "data_form";
        }
        dataService.save(data);
        redirect.addFlashAttribute("success", "Đã lưu data");
        return "redirect:/366026593";
    }
    
    @GetMapping("/366026593/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
    	dataService.delete(id);
        redirect.addFlashAttribute("success", "Đã xoá data");
        return "redirect:/366026593";
     }
    
    @GetMapping("/366026593/search")
    public String search(@RequestParam("q") String q, Model model) {
        if (q.equals("")) {
            return "redirect:/366026593";
        }
        
        model.addAttribute("datas", dataService.search(q));
        return "data_list";
    }

}
