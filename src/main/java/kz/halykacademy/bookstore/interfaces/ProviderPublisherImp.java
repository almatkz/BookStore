package kz.halykacademy.bookstore.interfaces;

import kz.halykacademy.bookstore.classes.Publisher;
import kz.halykacademy.bookstore.repository.PublisherRepository;

import java.util.List;

public class ProviderPublisherImp implements ProviderPublisher{
    private final PublisherRepository publisherRepository;

    public ProviderPublisherImp(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public List<Publisher> getAll()  {
        return publisherRepository.findAll();
    }
}
