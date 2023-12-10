package br.com.rcurvo.memecategory.services;

import br.com.rcurvo.memecategory.entities.CategoriaMeme;
import br.com.rcurvo.memecategory.repositories.RepositorioCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ServicoCategoriaMeme {

    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    public Iterable<CategoriaMeme> encontrarTodos(){
        return repositorioCategoriaMeme.findAll();
    }

    public CategoriaMeme criarCategoriaMeme(CategoriaMeme categoriaMeme){
        return repositorioCategoriaMeme.save(categoriaMeme);
    }
}
