package com.alura.Literalura;

import com.alura.Literalura.repository.AutorRepository;
import com.alura.Literalura.repository.LivroRepository;
import com.alura.Literalura.ui.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

    @Autowired
    private LivroRepository repositorioLivro;
    @Autowired
    private AutorRepository repositorioAutor;

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        MenuService menu = new MenuService(repositorioLivro, repositorioAutor);
        menu.exibeMenu();
    }
}
