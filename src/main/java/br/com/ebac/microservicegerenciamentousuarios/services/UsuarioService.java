package br.com.ebac.microservicegerenciamentousuarios.services;

import br.com.ebac.microservicegerenciamentousuarios.entities.Usuario;
import br.com.ebac.microservicegerenciamentousuarios.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Iterable<Usuario> listarTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario cadastrarNovoUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}

