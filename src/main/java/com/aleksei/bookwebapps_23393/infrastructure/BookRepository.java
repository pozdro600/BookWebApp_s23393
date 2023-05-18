package com.aleksei.bookwebapps_23393.infrastructure;

import com.aleksei.bookwebapps_23393.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {

    @Override
    Optional<Book> findById(Long aLong);
}
