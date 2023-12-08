package br.com.ebac.memelandia.utils;

import br.com.ebac.memelandia.dto.UsuarioDTO;
import br.com.ebac.memelandia.entities.Usuario;

import java.util.ArrayList;
import java.util.List;

public final class UsuarioUtils {
    private UsuarioUtils(){}

    public static Usuario fromUsuarioDTO(UsuarioDTO usuarioDTO){
        return new Usuario(usuarioDTO.getId(), usuarioDTO.getNome(), usuarioDTO.getEmail(), usuarioDTO.getDataCadastro());
    }

    public static UsuarioDTO toUsuarioDTO(Usuario usuario){
        return new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getDataCadastro());
    }

    public static Iterable<UsuarioDTO> toUsuarioDTO(Iterable<Usuario> usuarios){
        List<UsuarioDTO> usuariosDTO = new ArrayList<>();

        for(Usuario usuario : usuarios){
            usuariosDTO.add(toUsuarioDTO(usuario));
        }
        return usuariosDTO;
    }
}
