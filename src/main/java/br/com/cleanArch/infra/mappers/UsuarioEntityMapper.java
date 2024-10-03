package br.com.cleanArch.infra.mappers;

import br.com.cleanArch.domain.entities.usuario.Usuario;
import br.com.cleanArch.infra.persistence.UsuarioEntity;

public class UsuarioEntityMapper {

    public UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.getCpf(), usuario.getNome(), usuario.getNascimento(), usuario.getEmail());
    }

    public Usuario toUsuario(UsuarioEntity usuarioEntity) {
        return new Usuario(usuarioEntity.getCpf(), usuarioEntity.getNome(), usuarioEntity.getNascimento(), usuarioEntity.getEmail());
    }
}
