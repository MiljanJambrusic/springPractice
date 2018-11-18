/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Miljan
 */
@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    
    @RequestMapping("/books")
    public String getBooks(Model model) {
        
        model.addAttribute("books",bookRepository.findAll());
        
        return "books";
    }

}
