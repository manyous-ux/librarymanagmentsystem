package com.librarymanagmentsystem.librarymanagmentsystem.api.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Borrowing {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer borrowingId;

    @ManyToOne
    @JoinColumn(name="patronId")
    private Patron patron;

    @ManyToOne
    @JoinColumn(name="bookId")
    private Book book;

    @Column
    private LocalDate borrowingDate;
    
    @Column
    private LocalDate returnDate;


}
