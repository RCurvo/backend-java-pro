package br.com.ebac.memelandia.feign;

import br.com.ebac.memelandia.dto.CategoriaMemeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "cliente-novo-categoria-meme", url = "http://localhost:8083")
public interface ClienteFeignNovoCategoriaMeme {
    @RequestMapping(method = RequestMethod.POST, path = "/categoria")
    public CategoriaMemeDTO criarNovaCategoriaMeme(@RequestBody CategoriaMemeDTO categoriaMeme);

    @RequestMapping(method = RequestMethod.GET, path = "/categoria")
    public Iterable<CategoriaMemeDTO> encontrarTodos();
}
