package ec.edu.espe.prestamosapi.dto;

import jakarta.validation.constraints.Size;

public record DevolucionRequest(
        @Size(max = 300, message = "Las observaciones admiten máximo 300 caracteres")
        String observaciones) {
}