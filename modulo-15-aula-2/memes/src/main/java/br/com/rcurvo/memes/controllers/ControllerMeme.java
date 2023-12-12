package br.com.rcurvo.memes.controllers;

import br.com.rcurvo.memes.entities.Meme;
import br.com.rcurvo.memes.services.ServicoMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/memes")
public class ControllerMeme {

    @Autowired
    private ServicoMeme servicoMeme;

    @PostMapping
    public Meme criarMeme(@RequestBody Meme meme){
        return servicoMeme.criarMeme(meme);
    }

    @GetMapping
    public Iterable<Meme> encontrarTodos(){
        return servicoMeme.encontrarTodos();
    }
}
