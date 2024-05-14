package com.librarymanagmentsystem.librarymanagmentsystem.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagmentsystem.librarymanagmentsystem.api.Model.Patron;
import com.librarymanagmentsystem.librarymanagmentsystem.api.Service.PatronService;

@RestController
@RequestMapping("/api/patrons")
public class PatronController {
    
    @Autowired
    private PatronService patronService;

    @GetMapping
    public List<Patron> getAllUsers() {
        return patronService.findAll();
    }

    @PostMapping
    public Patron addUser(@RequestBody Patron patron) {
        return patronService.save(patron);
    }

    @GetMapping("/{id}")
    public Patron getBook(@PathVariable Integer id) {
        return patronService.findById(id);
    }

    @PutMapping("/{id}")
    public Patron updateBook(@PathVariable Integer id, @RequestBody Patron patron) {
        // Additional logic to ensure you're updating the correct book
        return patronService.save(patron);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Integer id) {
        patronService.deleteById(id);
    }
}
