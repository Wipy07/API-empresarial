package ec.edu.espe.prestamosapi.repository;

import ec.edu.espe.prestamosapi.entity.Equipo;
import ec.edu.espe.prestamosapi.entity.EstadoEquipo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    // Consultas personalizadas con Spring Data
    List<Equipo> findByEstado(EstadoEquipo estado);
    List<Equipo> findByTipoEquipoId(Long tipoEquipoId);

    boolean existsByTipoEquipoId(Long tipoEquipoId);
    boolean existsByCodigo(String codigo);
    boolean existsByCodigoAndIdNot(String codigo, Long id);
    boolean existsByNumeroSerie(String numeroSerie);
    boolean existsByNumeroSerieAndIdNot(String numeroSerie, Long id);
}