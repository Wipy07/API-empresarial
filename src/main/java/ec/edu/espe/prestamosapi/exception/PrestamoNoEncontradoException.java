package ec.edu.espe.prestamosapi.exception;

public class PrestamoNoEncontradoException extends RecursoNoEncontradoException {
    public PrestamoNoEncontradoException(Long id) { super("No existe el préstamo con id " + id); }
}