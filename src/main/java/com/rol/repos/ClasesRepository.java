package com.rol.repos;

import com.rol.domain.Clases;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * La interfaz `ClasesRepository` crea un repositorio para la entidad `Clases`. 
 * Esta interfaz extiende la interfaz JpaRepository y especifica que la entidad es `Clases` y el tipo de su identificador es `Long`.
 */
public interface ClasesRepository extends JpaRepository<Clases, Long> {
}
