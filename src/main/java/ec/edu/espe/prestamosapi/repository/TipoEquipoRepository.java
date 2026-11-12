package ec.edu.espe.prestamosapi.repository;

import ec.edu.espe.prestamosapi.entity.TipoEquipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoEquipoRepository extends JpaRepository<TipoEquipo, Long> {
    boolean existsByNombre(String nombre);
    boolean existsByNombreAndIdNot(String nombre, Long id);
}