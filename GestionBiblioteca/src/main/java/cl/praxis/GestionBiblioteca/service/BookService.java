package cl.praxis.GestionBiblioteca.service;

import cl.praxis.GestionBiblioteca.model.dto.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findOne(int id);
    boolean create(Book book);
    boolean update(Book book);
    boolean delete(int id);
}
