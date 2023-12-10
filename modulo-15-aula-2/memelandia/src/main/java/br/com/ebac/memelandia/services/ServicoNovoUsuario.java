package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.dto.NovoUsuarioDTO;
import br.com.ebac.memelandia.dto.UsuarioDTO;
import br.com.ebac.memelandia.feign.ClienteFeignNovoUsuario;
import br.com.ebac.memelandia.utils.UsuarioUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoNovoUsuario {

    private final ClienteFeignNovoUsuario clienteFeignNovoUsuario;

    public ServicoNovoUsuario(ClienteFeignNovoUsuario clienteFeignNovoUsuario) {
        this.clienteFeignNovoUsuario = clienteFeignNovoUsuario;
    }

    public UsuarioDTO criarNovoUsuario(UsuarioDTO UsuarioDTO) {
        NovoUsuarioDTO novoUsuarioDTO = UsuarioUtils.toNoVoUsuarioDTO(UsuarioDTO);
        novoUsuarioDTO = clienteFeignNovoUsuario.criarNovoUsuario(novoUsuarioDTO);
        System.out.println("--------------------------------------------------BATEU AQUI-------------------------------------------------------------------------");

        return UsuarioUtils.fromNovoUsuarioDTO(novoUsuarioDTO);
    }
}
