package com.librarymanagmentsystem.librarymanagmentsystem.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarymanagmentsystem.librarymanagmentsystem.api.Model.Patron;

public interface PatronRepository extends JpaRepository<Patron, Integer> {

    
} 
