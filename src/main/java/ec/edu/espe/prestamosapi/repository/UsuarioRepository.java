package ec.edu.espe.prestamosapi.repository;

import ec.edu.espe.prestamosapi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    boolean existsByIdentificacion(String identificacion);
    boolean existsByIdentificacionAndIdNot(String identificacion, Long id);
    boolean existsByCorreo(String correo);
    boolean existsByCorreoAndIdNot(String correo, Long id);
}