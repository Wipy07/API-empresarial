package ec.edu.espe.prestamosapi.exception;

public class EquipoNoEncontradoException extends RecursoNoEncontradoException {
    public EquipoNoEncontradoException(Long id) { super("No existe el equipo con id " + id); }
}