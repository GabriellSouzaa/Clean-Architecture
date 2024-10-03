package br.com.codechella.config;

import br.com.codechella.application.gateways.RepositorioDeUsuario;
import br.com.codechella.application.usecases.usuario.CriarUsuario;
import br.com.codechella.application.usecases.usuario.ListarUsuario;
import br.com.codechella.infra.gateways.RepositorioDeUsuarioJpa;
import br.com.codechella.infra.mappers.UsuarioEntityMapper;
import br.com.codechella.infra.persistence.repositories.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    UsuarioEntityMapper usuarioEntityMapper(){
        return new UsuarioEntityMapper();
    }

    @Bean
    RepositorioDeUsuarioJpa repositorioUsuarioJpa(UsuarioRepository usuarioRepository, UsuarioEntityMapper usuarioEntityMapper) {
        return new RepositorioDeUsuarioJpa(usuarioEntityMapper, usuarioRepository);
    };

    @Bean
    CriarUsuario criarUsuario(RepositorioDeUsuario repositorio) {
        return new CriarUsuario(repositorio);
    }

    @Bean
    ListarUsuario listarUsuario(RepositorioDeUsuario repositorio) {
        return new ListarUsuario(repositorio);
    }
}
