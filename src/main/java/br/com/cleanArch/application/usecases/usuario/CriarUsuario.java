package br.com.cleanArch.application.usecases.usuario;

import br.com.cleanArch.application.gateways.RepositorioDeUsuario;
import br.com.cleanArch.domain.entities.usuario.Usuario;

public class CriarUsuario {

    private final RepositorioDeUsuario repositorioUsuario;

    public CriarUsuario(RepositorioDeUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public Usuario criarUsuario(Usuario usuario) {
        return repositorioUsuario.criarUsuario(usuario);
    }
}
