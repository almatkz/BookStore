package kz.halykacademy.bookstore.interfaces;

import kz.halykacademy.bookstore.classes.Book;
import java.util.List;

public interface ProviderBook {

    List<Book> getAll();
}
