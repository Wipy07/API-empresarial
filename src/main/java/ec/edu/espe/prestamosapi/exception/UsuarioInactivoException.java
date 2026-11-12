package ec.edu.espe.prestamosapi.exception;

public class UsuarioInactivoException extends ReglaNegocioException {
    public UsuarioInactivoException(Long id) { super("El usuario con id " + id + " está inactivo"); }
}