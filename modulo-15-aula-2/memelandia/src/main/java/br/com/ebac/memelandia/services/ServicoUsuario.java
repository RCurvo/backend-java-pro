package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.dto.UsuarioDTO;
import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.repositories.RepositorioUsuario;
import br.com.ebac.memelandia.utils.UsuarioUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoUsuario {

    @Autowired
    public RepositorioUsuario repositorioUsuario;

    public Iterable<UsuarioDTO> encontrarTodos() {
        Iterable<Usuario> usuarioIterable = repositorioUsuario.findAll();

        return UsuarioUtils.toUsuarioDTO(usuarioIterable);
    }

    public UsuarioDTO criarUsuario(UsuarioDTO usuario){
        Usuario novoUsuario = UsuarioUtils.fromUsuarioDTO(usuario);
        novoUsuario = repositorioUsuario.save(novoUsuario);

        return UsuarioUtils.toUsuarioDTO(novoUsuario);
    }
}
