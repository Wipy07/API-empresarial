package ec.edu.espe.prestamosapi.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

public record PrestamoRequest(
        @NotNull(message = "El usuario es obligatorio")
        Long usuarioId,
        @NotNull(message = "El equipo es obligatorio")
        Long equipoId,
        LocalDate fechaPrestamo,
        @NotNull(message = "La fecha prevista de devolución es obligatoria")
        LocalDate fechaPrevistaDevolucion,
        @Size(max = 300, message = "Las observaciones admiten máximo 300 caracteres")
        String observaciones) {
}