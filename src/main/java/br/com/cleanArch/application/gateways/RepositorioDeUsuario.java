package br.com.cleanArch.application.gateways;

import br.com.cleanArch.domain.entities.usuario.Usuario;

import java.util.List;

public interface RepositorioDeUsuario {

    Usuario criarUsuario(Usuario usuario);

    List<Usuario> listarUsuarios();
}
