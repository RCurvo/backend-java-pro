package br.com.ebac.memelandia.controllers;


import br.com.ebac.memelandia.dto.UsuarioDTO;
import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.services.ServicoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "usuarios")
public class ControllerUsuario {

    @Autowired
    private ServicoUsuario servicoUsuario;

    @GetMapping
    public Iterable<UsuarioDTO> encontrarTodos(){
        return servicoUsuario.encontrarTodos();
    }

    @PostMapping
    public UsuarioDTO criarUsuario(@RequestBody UsuarioDTO usuario){
        return  servicoUsuario.criarUsuario(usuario);
    }
}
