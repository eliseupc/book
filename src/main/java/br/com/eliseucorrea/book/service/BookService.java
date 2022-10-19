package br.com.eliseucorrea.book.service;

import br.com.eliseucorrea.book.entity.Book;
import br.com.eliseucorrea.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void save(Book book){
        this.bookRepository.save(book);
    }

    public List<Book> findAll() {
        return this.bookRepository.findAll();
    }

    public Book findById(Long id) {
        return this.bookRepository.findById(id).get();
    }

    public void delete(Long id) {
        this.bookRepository.deleteById(id);
    }
}
