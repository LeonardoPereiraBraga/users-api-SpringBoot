package user.services.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import user.services.api.dominio.Usuario;
import user.services.api.repository.UsuarioRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository repository;

    public List<Usuario> findAll(){
        return repository.findAll();
    }
    public Usuario create(Usuario usuario){
        return repository.save(usuario);
    }

}
