package br.com.rcurvo.memecategory.services;

import br.com.rcurvo.memecategory.entities.CategoriaMeme;
import br.com.rcurvo.memecategory.repositories.RepositorioCategoriaMeme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ServicoCategoriaMeme {

    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    private static final Logger LOGGER = LoggerFactory.getLogger(ServicoCategoriaMeme.class);

    public Iterable<CategoriaMeme> encontrarTodos(){
        LOGGER.info("Retornando "+  repositorioCategoriaMeme.count() + " Memes");
        return repositorioCategoriaMeme.findAll();
    }

    public CategoriaMeme criarCategoriaMeme(CategoriaMeme categoriaMeme){
        LOGGER.info("Criando Categoria " + categoriaMeme.getNome());
        return repositorioCategoriaMeme.save(categoriaMeme);
    }
}
