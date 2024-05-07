package br.com.ebac.microservicegerenciamentousuarios.repositories;

import br.com.ebac.microservicegerenciamentousuarios.entities.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
