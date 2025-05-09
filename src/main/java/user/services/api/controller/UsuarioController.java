package user.services.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import user.services.api.dominio.Usuario;
import user.services.api.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService service;

    @GetMapping
    public ResponseEntity<List<Usuario>> findAllUsers(){
        List<Usuario> usuarios = service.findAll();
        return ResponseEntity.ok(usuarios);
    }
    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario){
        Usuario usuario1 = service.create(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario1);
    }
    @GetMapping("teste")
    public String teste(){
        return "Funcionou o teste";
    }

}
