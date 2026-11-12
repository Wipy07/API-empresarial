package ec.edu.espe.prestamosapi.dto;

import ec.edu.espe.prestamosapi.entity.EstadoGeneral;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record TipoEquipoRequest(
        @NotBlank(message = "El nombre es obligatorio")
        @Size(max = 60, message = "El nombre admite máximo 60 caracteres")
        String nombre,
        @Size(max = 200, message = "La descripción admite máximo 200 caracteres")
        String descripcion,
        EstadoGeneral estado) {
}