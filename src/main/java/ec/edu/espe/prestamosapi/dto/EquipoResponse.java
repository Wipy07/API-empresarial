package ec.edu.espe.prestamosapi.dto;

import ec.edu.espe.prestamosapi.entity.EstadoEquipo;

public record EquipoResponse(Long id, String codigo, String nombre, String descripcion, String marca,
                             String modelo, String numeroSerie, EstadoEquipo estado,
                             Long tipoEquipoId, String tipoEquipoNombre) {
}