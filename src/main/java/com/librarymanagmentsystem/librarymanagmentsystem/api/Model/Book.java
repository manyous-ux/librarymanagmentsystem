package com.librarymanagmentsystem.librarymanagmentsystem.api.Model;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
@Entity
public class Book {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	
	@Column(length = 100, nullable = false)
	private String title;
	
	@Column(length = 100, nullable = false)
	private String bookAuthor;
	
	@Column(length = 500, nullable = false)
	private String publicationYear;
	
    @Column(length = 2500)
	private String ISBN;
    
    @ManyToOne
    private Patron patron;
    
	@Column
	private Boolean IsRented;
}
