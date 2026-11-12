package ec.edu.espe.prestamosapi.dto;

import ec.edu.espe.prestamosapi.entity.EstadoGeneral;

public record TipoEquipoResponse(Long id, String nombre, String descripcion, EstadoGeneral estado) {
}