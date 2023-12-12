package br.com.rcurvo.memes.services;

import br.com.rcurvo.memes.entities.Meme;
import br.com.rcurvo.memes.repositories.RepositorioMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ServicoMeme {

    @Autowired
    private RepositorioMeme repositorioMeme;

    public Iterable<Meme> encontrarTodos(){
        return repositorioMeme.findAll();
    }

    public Meme criarMeme(Meme meme){
        return repositorioMeme.save(meme);
    }
}
