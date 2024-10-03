package br.com.cleanArch.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {

    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Usuario("123456789-99", "Gabriel", LocalDate.now(), "email@email.com"));
    }

    @Test
    public void deveCriarUsuarioComFabricaDeUsuario(){
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeComCpfNascimento("Gabriel", "654.123.123-33", LocalDate.now());
        Assertions.assertEquals("Gabriel", usuario.getNome());
        usuario = fabrica.incluiEndereco("19820-000", 40, "Apartamento");
        Assertions.assertEquals("Apartamento", usuario.getEndereco().getComplemento());
    }
}
