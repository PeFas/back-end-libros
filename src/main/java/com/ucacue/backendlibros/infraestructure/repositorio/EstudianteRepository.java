package com.ucacue.backendlibros.infraestructure.repositorio;

import com.ucacue.backendlibros.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
