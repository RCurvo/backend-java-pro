package br.com.rcurvo.memes.services;

import br.com.rcurvo.memes.controllers.ControllerMeme;
import br.com.rcurvo.memes.entities.Meme;
import br.com.rcurvo.memes.repositories.RepositorioMeme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Random;


@Component
public class ServicoMeme {

    @Autowired
    private RepositorioMeme repositorioMeme;

    private static final Logger LOGGER = LoggerFactory.getLogger(ServicoMeme.class);

    public Iterable<Meme> encontrarTodos(){
        LOGGER.info("Retornando "+  repositorioMeme.count() + " Memes");

        return repositorioMeme.findAll();
    }

    public Meme criarMeme(Meme meme) {
        LOGGER.info("Criando meme");
        return repositorioMeme.save(meme);
    }

    public Optional<Meme> encontrarMemeAleatorio(){
        LOGGER.info("Retornando Meme aleatorio");
//        List<Meme> listMeme = repositorioMeme.findAll();
//        Integer randomIndex = Double.valueOf(Math.floor(listMeme.size() * Math.random())).intValue();
//        return listMeme.get(randomIndex);
        return repositorioMeme.findRandomMeme();
    }
}
