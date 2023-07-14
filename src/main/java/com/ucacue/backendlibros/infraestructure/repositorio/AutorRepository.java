package com.ucacue.backendlibros.infraestructure.repositorio;

import com.ucacue.backendlibros.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

}

