package com.swapnilxi.springboottesting;
import jakarta.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Entity
@Table(name="book_record")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;
    @NonNull
    private String name;
    @NonNull
    private String summary;

    private int rating;
    
}
