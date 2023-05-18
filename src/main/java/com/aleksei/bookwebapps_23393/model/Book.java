package com.aleksei.bookwebapps_23393.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@ToString
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String title;

    String author;

    String isbn;

    String publisher;

    Boolean available;

    LocalDate published;

}
