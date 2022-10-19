package br.com.eliseucorrea.book.repository;

import br.com.eliseucorrea.book.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
