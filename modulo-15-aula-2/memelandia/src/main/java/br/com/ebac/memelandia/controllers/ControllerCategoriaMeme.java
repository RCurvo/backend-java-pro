package br.com.ebac.memelandia.controllers;

import br.com.ebac.memelandia.dto.CategoriaMemeDTO;
import br.com.ebac.memelandia.services.ServicoNovoCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/categoria")
public class ControllerCategoriaMeme {

    @Autowired
    public ServicoNovoCategoriaMeme servicoNovoCategoriaMeme;

    @GetMapping
    public Iterable<CategoriaMemeDTO> buscaCategorias() {
        return servicoNovoCategoriaMeme.encontrarTodos();
    }

    @PostMapping
    public CategoriaMemeDTO novaCategoria(@RequestBody CategoriaMemeDTO categoriaMeme) {
        return servicoNovoCategoriaMeme.criarNovaCategoria(categoriaMeme);
    }
}
