package kz.halykacademy.bookstore.repository;

import kz.halykacademy.bookstore.classes.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>  {
}

