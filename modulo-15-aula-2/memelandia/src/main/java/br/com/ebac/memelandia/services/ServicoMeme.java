package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.dto.CategoriaMemeDTO;
import br.com.ebac.memelandia.dto.MemeDTO;
import br.com.ebac.memelandia.feign.ClienteFeignMeme;
import org.springframework.stereotype.Component;

@Component
public class ServicoMeme {

    private ClienteFeignMeme clienteFeignMeme;

    public ServicoMeme(ClienteFeignMeme clienteFeignMeme) {
        this.clienteFeignMeme = clienteFeignMeme;
    }

    public MemeDTO criarNovoMeme(MemeDTO meme){
        return clienteFeignMeme.criarNovoMeme(meme);
    }

    public Iterable<MemeDTO> encontrarTodos() {
        return clienteFeignMeme.encontrarTodos();
    }


}
