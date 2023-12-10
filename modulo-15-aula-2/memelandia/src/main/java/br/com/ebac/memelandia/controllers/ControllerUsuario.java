package br.com.ebac.memelandia.controllers;


import br.com.ebac.memelandia.dto.UsuarioDTO;
import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.services.ServicoNovoUsuario;
import br.com.ebac.memelandia.services.ServicoUsuario;
import br.com.ebac.memelandia.utils.UsuarioUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "usuarios")
public class ControllerUsuario {

    @Autowired
    private ServicoUsuario servicoUsuario;

    @Autowired
    private ServicoNovoUsuario servicoNovoUsuario;

    @GetMapping
    public Iterable<UsuarioDTO> encontrarTodos(){
        return servicoUsuario.encontrarTodos();
    }

    @PostMapping
    public UsuarioDTO criarUsuario(@RequestBody UsuarioDTO usuario){
        UsuarioDTO novoUsuarioDTOCriado = servicoNovoUsuario.criarNovoUsuario(usuario);
        UsuarioDTO usuarioDTOCriado = servicoUsuario.criarUsuario(usuario);

        return novoUsuarioDTOCriado;
    }
}
