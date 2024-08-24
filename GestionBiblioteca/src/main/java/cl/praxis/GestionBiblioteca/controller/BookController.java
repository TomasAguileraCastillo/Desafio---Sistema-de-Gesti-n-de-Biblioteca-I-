package cl.praxis.GestionBiblioteca.controller;


import cl.praxis.GestionBiblioteca.GestionBibliotecaApplication;
import cl.praxis.GestionBiblioteca.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BookController {
    private static final Logger logger = LoggerFactory.getLogger(GestionBibliotecaApplication.class);

    @Autowired
    private BookService service;

    @GetMapping
    public String findAll(Model model) {
        logger.warn("Ejecutando findAll");
        model.addAttribute("books", service.findAll());
        return "bookList";
    }
}