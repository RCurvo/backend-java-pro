package br.com.ebac.memelandia.feign;

import br.com.ebac.memelandia.dto.CategoriaMemeDTO;
import br.com.ebac.memelandia.dto.MemeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "cliente-meme", url = "http://localhost:8084")
public interface ClienteFeignMeme {
    @RequestMapping(method = RequestMethod.POST, path = "/memes")
    public MemeDTO criarNovoMeme(@RequestBody MemeDTO meme);

    @RequestMapping(method = RequestMethod.GET, path = "/memes")
    public Iterable<MemeDTO> encontrarTodos();

    @RequestMapping(method = RequestMethod.GET, path = "/memes/random")
    public MemeDTO encontrarMemeAleatorio();
}
