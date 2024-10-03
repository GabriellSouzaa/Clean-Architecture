package br.com.codechella.application.usecases.usuario;

import br.com.codechella.application.gateways.RepositorioDeUsuario;
import br.com.codechella.domain.entities.usuario.Usuario;

public class CriarUsuario {

    private final RepositorioDeUsuario repositorioUsuario;

    public CriarUsuario(RepositorioDeUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public Usuario criarUsuario(Usuario usuario) {
        return repositorioUsuario.criarUsuario(usuario);
    }
}
