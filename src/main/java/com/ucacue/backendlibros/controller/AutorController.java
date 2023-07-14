package com.ucacue.backendlibros.controller;

import com.ucacue.backendlibros.infraestructure.repositorio.AutorRepository;
import com.ucacue.backendlibros.model.Autor;
import com.ucacue.backendlibros.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class AutorController {

    @Autowired
    AutorRepository autorRepository;

    @GetMapping("/autores")
    public List<Autor> getAllAutor(){
        return autorRepository.findAll();
    }

    @GetMapping("/autores/{id}")
    public List<Libro> getLibrosByAutor(@PathVariable int id){
        return autorRepository.findById(id).get().getLibros();
    }
}
