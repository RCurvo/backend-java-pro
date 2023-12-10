package br.com.ebac.memelandia.feign;

import br.com.ebac.memelandia.dto.NovoUsuarioDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "cliente-novo-usuario", url = "http://localhost:8082")
public interface ClienteFeignNovoUsuario {
    @RequestMapping(method = RequestMethod.POST, path = "/usuarios")
    public NovoUsuarioDTO criarNovoUsuario(@RequestBody NovoUsuarioDTO novoUsuarioDTO);

    @RequestMapping(method = RequestMethod.GET, path = "/usuarios")
    public Iterable<NovoUsuarioDTO> encontrarTodos();
}
