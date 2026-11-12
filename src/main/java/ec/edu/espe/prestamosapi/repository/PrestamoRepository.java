package ec.edu.espe.prestamosapi.repository;

import ec.edu.espe.prestamosapi.entity.EstadoPrestamo;
import ec.edu.espe.prestamosapi.entity.Prestamo;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
    // Consultas personalizadas con Spring Data
    List<Prestamo> findByEstado(EstadoPrestamo estado);
    List<Prestamo> findByUsuarioId(Long usuarioId);
    List<Prestamo> findByEstadoAndFechaPrevistaDevolucionBefore(EstadoPrestamo estado, LocalDate fecha);

    Optional<Prestamo> findFirstByEquipoIdAndEstado(Long equipoId, EstadoPrestamo estado);
    boolean existsByEquipoIdAndEstado(Long equipoId, EstadoPrestamo estado);
    boolean existsByUsuarioId(Long usuarioId);
    boolean existsByEquipoId(Long equipoId);
}