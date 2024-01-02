package br.com.rcurvo.users.repositories;

import br.com.rcurvo.users.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, String> {
}
