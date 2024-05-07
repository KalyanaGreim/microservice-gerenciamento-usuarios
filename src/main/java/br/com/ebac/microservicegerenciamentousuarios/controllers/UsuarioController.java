package br.com.ebac.microservicegerenciamentousuarios.controllers;

import br.com.ebac.microservicegerenciamentousuarios.entities.Usuario;
import br.com.ebac.microservicegerenciamentousuarios.services.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public Iterable<Usuario> buscarTodosUsuarios() {
        return usuarioService.listarTodosUsuarios();
    }

    @PostMapping
    public Usuario cadastrarNovoUsuario(@RequestBody Usuario usuario) {
        return usuarioService.cadastrarNovoUsuario(usuario);
    }
}
