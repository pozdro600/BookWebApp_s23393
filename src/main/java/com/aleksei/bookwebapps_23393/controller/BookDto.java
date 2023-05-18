package com.aleksei.bookwebapps_23393.controller;

import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class BookDto {

    String title;

    String author;

    String isbn;

    String publisher;

    Boolean available;

    LocalDate published;

}
