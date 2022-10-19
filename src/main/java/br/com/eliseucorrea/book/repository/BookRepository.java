package br.com.eliseucorrea.book.repository;


import br.com.eliseucorrea.book.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    @Override
    List<Book> findAll();
}
