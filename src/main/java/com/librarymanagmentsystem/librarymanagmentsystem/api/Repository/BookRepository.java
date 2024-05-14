package com.librarymanagmentsystem.librarymanagmentsystem.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarymanagmentsystem.librarymanagmentsystem.api.Model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
    
}
