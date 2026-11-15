package ec.edu.espe.prestamosapi.dto;

import ec.edu.espe.prestamosapi.entity.EstadoPrestamo;
import java.time.LocalDate;

public record PrestamoResponse(Long id, Long usuarioId, String usuarioNombre, Long equipoId,
                               String equipoCodigo, LocalDate fechaPrestamo,
                               LocalDate fechaPrevistaDevolucion, LocalDate fechaRealDevolucion,
                               EstadoPrestamo estado, boolean vencido, String observaciones) {
}