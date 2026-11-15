package ec.edu.espe.prestamosapi.dto;

import java.time.LocalDateTime;
import java.util.List;

//Respuesta de error y manejador global
public record ErrorRespuesta(
        LocalDateTime fechaHora,
        int codigo,
        String error,
        String mensaje,
        String ruta,
        List<String> detalles) {
}