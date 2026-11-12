package ec.edu.espe.prestamosapi.exception;

public class PrestamoActivoNoEncontradoException extends ReglaNegocioException {
    public PrestamoActivoNoEncontradoException(Long prestamoId) {
        super("El préstamo " + prestamoId + " no está activo: ya fue devuelto");
    }
}