package br.com.cleanArch.infra.persistence.repositories;

import br.com.cleanArch.infra.persistence.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
