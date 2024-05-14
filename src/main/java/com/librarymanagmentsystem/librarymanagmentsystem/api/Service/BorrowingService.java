package com.librarymanagmentsystem.librarymanagmentsystem.api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymanagmentsystem.librarymanagmentsystem.api.Model.Borrowing;
import com.librarymanagmentsystem.librarymanagmentsystem.api.Repository.BorrowingRepository;

@Service
public class BorrowingService {
    
    @Autowired
    private BorrowingRepository bookRepository;

    public Borrowing findById(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }
    
    public Borrowing save(Borrowing borrowing) {
        return bookRepository.save(borrowing);
    }

    public void deleteById(Integer id) {
        bookRepository.deleteById(id);
    }
}
