package kz.halykacademy.bookstore.interfaces;

import kz.halykacademy.bookstore.classes.Book;
import kz.halykacademy.bookstore.repository.BookRepository;

import java.util.List;

public class ProviderBookImp implements ProviderBook{
    private final BookRepository bookRepository;

    public ProviderBookImp(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAll()  {
        return bookRepository.findAll();
    }
}
