package ec.edu.espe.prestamosapi.exception;

public class UsuarioNoEncontradoException extends RecursoNoEncontradoException {
    public UsuarioNoEncontradoException(Long id) { super("No existe el usuario con id " + id); }
}