package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.dto.CategoriaMemeDTO;
import br.com.ebac.memelandia.dto.MemeDTO;
import br.com.ebac.memelandia.feign.ClienteFeignMeme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ServicoMeme {

    private ClienteFeignMeme clienteFeignMeme;

    private static final Logger LOGGER = LoggerFactory.getLogger(ServicoMeme.class);

    public ServicoMeme(ClienteFeignMeme clienteFeignMeme) {
        this.clienteFeignMeme = clienteFeignMeme;
    }

    public MemeDTO criarNovoMeme(MemeDTO meme){
        LOGGER.info("Criando novo meme");
        return clienteFeignMeme.criarNovoMeme(meme);
    }

    public Iterable<MemeDTO> encontrarTodos() {
        LOGGER.info("Encontrar todos os memes");
        return clienteFeignMeme.encontrarTodos();
    }


}
