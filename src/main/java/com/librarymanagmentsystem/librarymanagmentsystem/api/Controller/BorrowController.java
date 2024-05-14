package com.librarymanagmentsystem.librarymanagmentsystem.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagmentsystem.librarymanagmentsystem.api.Model.Book;
import com.librarymanagmentsystem.librarymanagmentsystem.api.Model.Borrowing;
import com.librarymanagmentsystem.librarymanagmentsystem.api.Service.BookService;
import com.librarymanagmentsystem.librarymanagmentsystem.api.Service.BorrowingService;

@RestController
@RequestMapping("/api/borrow")
public class BorrowController {
    @Autowired
    private BorrowingService borrowService;
    @Autowired
    private BookService bookService;

    private Book book;
    @PostMapping("/{bookId}/patron/{patronId}")
    public Borrowing borrowBook(@RequestBody Borrowing borrow) {
       
        return borrowService.save(borrow);
    }

    @PutMapping("/return/{bookId}/patron/{patronId}")
    public Borrowing returnBook(@PathVariable Integer id, @RequestBody Borrowing borrow) {
        // Additional logic to ensure you're updating the correct book
        
        return borrowService.save(borrow);
    }
}
