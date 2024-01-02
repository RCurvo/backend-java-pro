package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.dto.CategoriaMemeDTO;
import br.com.ebac.memelandia.feign.ClienteFeignNovoCategoriaMeme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ServicoNovoCategoriaMeme {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServicoNovoCategoriaMeme.class);

    private final ClienteFeignNovoCategoriaMeme clienteFeignNovoCategoriaMeme;

    public ServicoNovoCategoriaMeme(ClienteFeignNovoCategoriaMeme clienteFeignNovoCategoriaMeme) {
        this.clienteFeignNovoCategoriaMeme = clienteFeignNovoCategoriaMeme;
    }

    public CategoriaMemeDTO criarNovaCategoria(CategoriaMemeDTO categoriaMemeDTO) {
        LOGGER.info("Criando nova Categoria Meme");
        return clienteFeignNovoCategoriaMeme.criarNovaCategoriaMeme(categoriaMemeDTO);
    }

    public Iterable<CategoriaMemeDTO> encontrarTodos() {
        LOGGER.info("Encontrar todas categorias");
        return clienteFeignNovoCategoriaMeme.encontrarTodos();
    }

}
