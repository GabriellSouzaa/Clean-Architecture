package br.com.codechella.application.usecases.usuario;

import br.com.codechella.application.gateways.RepositorioDeUsuario;
import br.com.codechella.domain.entities.usuario.Usuario;

import java.util.List;

public class ListarUsuario {

    private final RepositorioDeUsuario repositorioUsuario;

    public ListarUsuario(RepositorioDeUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public List<Usuario> listarUsuarios() {
        return this.repositorioUsuario.listarUsuarios();
    }
}
