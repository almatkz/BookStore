package kz.halykacademy.bookstore.interfaces;

import kz.halykacademy.bookstore.classes.Author;
import java.util.List;

public interface ProviderAuthor {
    List<Author> getAll();
}
