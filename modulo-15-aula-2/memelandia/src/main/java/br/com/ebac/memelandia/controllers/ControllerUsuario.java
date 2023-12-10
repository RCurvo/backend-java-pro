package br.com.ebac.memelandia.controllers;


import br.com.ebac.memelandia.dto.NovoUsuarioDTO;
import br.com.ebac.memelandia.services.ServicoNovoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "usuarios")
public class ControllerUsuario {

    @Autowired
    private ServicoNovoUsuario servicoNovoUsuario;

    @GetMapping
    public Iterable<NovoUsuarioDTO> encontrarTodos(){
        return servicoNovoUsuario.encontrarTodos();
    }

    @PostMapping
    public NovoUsuarioDTO criarUsuario(@RequestBody NovoUsuarioDTO usuario){

        return servicoNovoUsuario.criarNovoUsuario(usuario);
    }
}
