package br.com.cleanArch.application.usecases.usuario;

import br.com.cleanArch.application.gateways.RepositorioDeUsuario;
import br.com.cleanArch.domain.entities.usuario.Usuario;

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
