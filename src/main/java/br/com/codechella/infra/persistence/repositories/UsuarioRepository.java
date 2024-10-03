package br.com.codechella.infra.persistence.repositories;

import br.com.codechella.infra.persistence.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
