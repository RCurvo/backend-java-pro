package br.com.ebac.memelandia.controllers;

import br.com.ebac.memelandia.dto.MemeDTO;
import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.services.ServicoMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/memes")
public class ControllerMeme {

    @Autowired
    private ServicoMeme servicoMeme;

    @GetMapping
    public Iterable<MemeDTO> buscaMemes() {
        return servicoMeme.encontrarTodos();
    }

    @PostMapping
    public MemeDTO novoMeme(@RequestBody MemeDTO meme) {
        return servicoMeme.criarNovoMeme(meme);
    }
}
