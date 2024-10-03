package br.com.codechella.application.gateways;

import br.com.codechella.domain.entities.usuario.Usuario;

import java.util.List;

public interface RepositorioDeUsuario {

    Usuario criarUsuario(Usuario usuario);

    List<Usuario> listarUsuarios();
}
