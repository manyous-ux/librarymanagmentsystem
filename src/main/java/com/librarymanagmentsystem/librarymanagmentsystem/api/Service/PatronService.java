package com.librarymanagmentsystem.librarymanagmentsystem.api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymanagmentsystem.librarymanagmentsystem.api.Model.Patron;
import com.librarymanagmentsystem.librarymanagmentsystem.api.Repository.PatronRepository;

@Service
public class PatronService {
    @Autowired
    private PatronRepository patronRepository;

    public List<Patron> findAll() {
        return patronRepository.findAll();
    }

    public Patron save(Patron patron) {
        return patronRepository.save(patron);
    }

    public Patron findById(Integer id) {
        return patronRepository.findById(id).orElse(null);
    }

    public void deleteById(Integer id) {
        patronRepository.deleteById(id);
    }
}
