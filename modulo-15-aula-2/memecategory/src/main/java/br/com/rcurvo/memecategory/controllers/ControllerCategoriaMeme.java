package br.com.rcurvo.memecategory.controllers;

import br.com.rcurvo.memecategory.entities.CategoriaMeme;
import br.com.rcurvo.memecategory.services.ServicoCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/categoria")
public class ControllerCategoriaMeme {

    @Autowired
    private ServicoCategoriaMeme servicoCategoriaMeme;

    @PostMapping
    public CategoriaMeme criarCategoriaMeme(@RequestBody CategoriaMeme categoriaMeme){
        return servicoCategoriaMeme.criarCategoriaMeme(categoriaMeme);
    }

    @GetMapping
    public Iterable<CategoriaMeme> encontrarTodos(){
        return servicoCategoriaMeme.encontrarTodos();
    }
}
