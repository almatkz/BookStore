package kz.halykacademy.bookstore.interfaces;

import kz.halykacademy.bookstore.classes.Author;
import kz.halykacademy.bookstore.repository.AuthorRepository;

import java.util.List;

public class ProviderAuthorImp implements ProviderAuthor {
    private final AuthorRepository authorRepository;

    public ProviderAuthorImp(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getAll()  {
        return authorRepository.findAll();
    }
}
