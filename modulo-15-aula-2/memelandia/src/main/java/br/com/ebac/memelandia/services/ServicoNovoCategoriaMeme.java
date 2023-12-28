package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.dto.CategoriaMemeDTO;
import br.com.ebac.memelandia.feign.ClienteFeignNovoCategoriaMeme;
import org.springframework.stereotype.Component;

@Component
public class ServicoNovoCategoriaMeme {

    private final ClienteFeignNovoCategoriaMeme clienteFeignNovoCategoriaMeme;

    public ServicoNovoCategoriaMeme(ClienteFeignNovoCategoriaMeme clienteFeignNovoCategoriaMeme) {
        this.clienteFeignNovoCategoriaMeme = clienteFeignNovoCategoriaMeme;
    }

    public CategoriaMemeDTO criarNovaCategoria(CategoriaMemeDTO categoriaMemeDTO) {
        return clienteFeignNovoCategoriaMeme.criarNovaCategoriaMeme(categoriaMemeDTO);
    }

    public Iterable<CategoriaMemeDTO> encontrarTodos() {
        return clienteFeignNovoCategoriaMeme.encontrarTodos();
    }

}
