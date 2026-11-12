package ec.edu.espe.prestamosapi.exception;

public class EquipoNoDisponibleException extends ReglaNegocioException {
    public EquipoNoDisponibleException(String codigo, String estado) {
        super("El equipo " + codigo + " no está disponible (estado actual: " + estado + ")");
    }
}