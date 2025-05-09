package user.services.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import user.services.api.dominio.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
