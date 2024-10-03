package br.com.cleanArch.config;

import br.com.cleanArch.application.gateways.RepositorioDeUsuario;
import br.com.cleanArch.application.usecases.usuario.CriarUsuario;
import br.com.cleanArch.application.usecases.usuario.ListarUsuario;
import br.com.cleanArch.infra.gateways.RepositorioDeUsuarioJpa;
import br.com.cleanArch.infra.mappers.UsuarioEntityMapper;
import br.com.cleanArch.infra.persistence.repositories.UsuarioRepository;
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
