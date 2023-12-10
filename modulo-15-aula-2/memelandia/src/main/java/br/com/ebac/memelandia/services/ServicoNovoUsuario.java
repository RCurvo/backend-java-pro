package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.dto.NovoUsuarioDTO;

import br.com.ebac.memelandia.feign.ClienteFeignNovoUsuario;

import org.springframework.stereotype.Component;


@Component
public class ServicoNovoUsuario {

    private final ClienteFeignNovoUsuario clienteFeignNovoUsuario;

    public ServicoNovoUsuario(ClienteFeignNovoUsuario clienteFeignNovoUsuario) {
        this.clienteFeignNovoUsuario = clienteFeignNovoUsuario;
    }

    public NovoUsuarioDTO criarNovoUsuario(NovoUsuarioDTO usuarioDTO) {
        return clienteFeignNovoUsuario.criarNovoUsuario(usuarioDTO);
    }

    public Iterable<NovoUsuarioDTO> encontrarTodos() {
        return clienteFeignNovoUsuario.encontrarTodos();
    }
}
