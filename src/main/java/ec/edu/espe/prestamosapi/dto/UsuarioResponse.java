package ec.edu.espe.prestamosapi.dto;

import ec.edu.espe.prestamosapi.entity.EstadoGeneral;

public record UsuarioResponse(Long id, String identificacion, String nombres, String apellidos,
                              String correo, String telefono, EstadoGeneral estado) {
}