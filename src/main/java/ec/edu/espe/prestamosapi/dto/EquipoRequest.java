package ec.edu.espe.prestamosapi.dto;

import ec.edu.espe.prestamosapi.entity.EstadoEquipo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record EquipoRequest(
        @NotBlank(message = "El código es obligatorio")
        @Size(max = 30, message = "El código admite máximo 30 caracteres")
        String codigo,
        @NotBlank(message = "El nombre es obligatorio")
        @Size(max = 100, message = "El nombre admite máximo 100 caracteres")
        String nombre,
        @Size(max = 200, message = "La descripción admite máximo 200 caracteres")
        String descripcion,
        @Size(max = 60, message = "La marca admite máximo 60 caracteres")
        String marca,
        @Size(max = 60, message = "El modelo admite máximo 60 caracteres")
        String modelo,
        @NotBlank(message = "El número de serie es obligatorio")
        @Size(max = 60, message = "El número de serie admite máximo 60 caracteres")
        String numeroSerie,
        @NotNull(message = "El tipo de equipo es obligatorio")
        Long tipoEquipoId,
        EstadoEquipo estado) {
}
