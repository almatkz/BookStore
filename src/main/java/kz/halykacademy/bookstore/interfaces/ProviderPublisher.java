package kz.halykacademy.bookstore.interfaces;

import kz.halykacademy.bookstore.classes.Publisher;
import java.util.List;

public interface ProviderPublisher {
    List<Publisher> getAll();
}
