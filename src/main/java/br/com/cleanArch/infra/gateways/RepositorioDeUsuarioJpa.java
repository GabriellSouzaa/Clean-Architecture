package br.com.cleanArch.infra.gateways;

import br.com.cleanArch.application.gateways.RepositorioDeUsuario;
import br.com.cleanArch.domain.entities.usuario.Usuario;
import br.com.cleanArch.infra.mappers.UsuarioEntityMapper;
import br.com.cleanArch.infra.persistence.UsuarioEntity;
import br.com.cleanArch.infra.persistence.repositories.UsuarioRepository;

import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeUsuarioJpa implements RepositorioDeUsuario {

    private final UsuarioEntityMapper mapper;

    private final UsuarioRepository repositorio;

    public RepositorioDeUsuarioJpa(UsuarioEntityMapper mapper, UsuarioRepository repositorio) {
        this.mapper = mapper;
        this.repositorio = repositorio;
    }

    @Override
    public Usuario criarUsuario(Usuario usuario) {
        UsuarioEntity usuarioEntity = mapper.toEntity(usuario);
        this.repositorio.save(usuarioEntity);
        return mapper.toUsuario(usuarioEntity);
    }

    @Override
    public List<Usuario> listarUsuarios() {
    return repositorio.findAll().stream()
            .map(mapper::toUsuario)
            .collect(Collectors.toList());
    }
}
