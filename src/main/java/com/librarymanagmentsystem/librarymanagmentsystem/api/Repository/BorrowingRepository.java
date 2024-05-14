package com.librarymanagmentsystem.librarymanagmentsystem.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarymanagmentsystem.librarymanagmentsystem.api.Model.Borrowing;

public interface BorrowingRepository extends JpaRepository<Borrowing, Integer> {
    
    
}
