package br.com.codechella.infra.models.responses;

import java.time.LocalDate;

public record UsuarioResponse(String cpf, String nome, LocalDate dataNascimento, String email) {
}
