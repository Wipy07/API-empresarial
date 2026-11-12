package ec.edu.espe.prestamosapi.dto;

import ec.edu.espe.prestamosapi.entity.EstadoGeneral;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UsuarioRequest(
        @NotBlank(message = "La identificación es obligatoria")
        @Pattern(regexp = "\\d{10,13}", message = "La identificación debe tener entre 10 y 13 dígitos")
        String identificacion,
        @NotBlank(message = "Los nombres son obligatorios")
        @Size(max = 80, message = "Los nombres admiten máximo 80 caracteres")
        String nombres,
        @NotBlank(message = "Los apellidos son obligatorios")
        @Size(max = 80, message = "Los apellidos admiten máximo 80 caracteres")
        String apellidos,
        @NotBlank(message = "El correo es obligatorio")
        @Email(message = "El correo no tiene un formato válido")
        @Size(max = 120, message = "El correo admite máximo 120 caracteres")
        String correo,
        @Pattern(regexp = "\\d{7,15}", message = "El teléfono debe tener entre 7 y 15 dígitos")
        String telefono,
        EstadoGeneral estado) {
}