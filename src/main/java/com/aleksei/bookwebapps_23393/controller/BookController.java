package com.aleksei.bookwebapps_23393.controller;

import com.aleksei.bookwebapps_23393.infrastructure.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.aleksei.bookwebapps_23393.model.Book;

import java.util.Optional;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository repository;

    @GetMapping("{id}")
    public ResponseEntity<String> getBookById(@PathVariable Long id) {
        Optional<Book> book = repository.findById(id);
        if(book.isPresent()) return new ResponseEntity<>(book.toString(), HttpStatus.OK);
        else return new ResponseEntity<>("Book not found", HttpStatus.NOT_FOUND);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Book persistBook(@RequestBody BookDto bookDto) {
        return repository.save(Book.builder()
                .title(bookDto.getTitle())
                .author(bookDto.getAuthor())
                .isbn(bookDto.getIsbn())
                .publisher(bookDto.getPublisher())
                .available(bookDto.getAvailable())
                .build());
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteBookById(@PathVariable Long id) {
        repository.deleteById(id);
    }
}