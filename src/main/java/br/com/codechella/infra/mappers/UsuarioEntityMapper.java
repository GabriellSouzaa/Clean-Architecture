package br.com.codechella.infra.mappers;

import br.com.codechella.domain.entities.usuario.Usuario;
import br.com.codechella.infra.persistence.UsuarioEntity;

public class UsuarioEntityMapper {

    public UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.getCpf(), usuario.getNome(), usuario.getNascimento(), usuario.getEmail());
    }

    public Usuario toUsuario(UsuarioEntity usuarioEntity) {
        return new Usuario(usuarioEntity.getCpf(), usuarioEntity.getNome(), usuarioEntity.getNascimento(), usuarioEntity.getEmail());
    }
}
