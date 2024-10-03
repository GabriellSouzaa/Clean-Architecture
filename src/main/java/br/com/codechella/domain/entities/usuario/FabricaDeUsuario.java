package br.com.codechella.domain.entities.usuario;

import br.com.codechella.domain.Endereco;

import java.time.LocalDate;

public class FabricaDeUsuario {

    private Usuario usuario;

    public Usuario comNomeComCpfNascimento(String nome, String cpf, LocalDate nascimento) {
       this.usuario = new Usuario(cpf, nome, nascimento, "");
       return this.usuario;
    }

    public Usuario incluiEndereco(String cep, Integer numero, String complemento){
        this.usuario.setEndereco(new Endereco(cep, numero, complemento));
        return this.usuario;
    }
}
