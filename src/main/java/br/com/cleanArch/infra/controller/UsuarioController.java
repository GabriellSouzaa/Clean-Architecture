package br.com.cleanArch.infra.controller;

import br.com.cleanArch.application.usecases.usuario.CriarUsuario;
import br.com.cleanArch.application.usecases.usuario.ListarUsuario;
import br.com.cleanArch.domain.entities.usuario.Usuario;
import br.com.cleanArch.infra.models.requests.UsuarioRequest;
import br.com.cleanArch.infra.models.responses.UsuarioResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final CriarUsuario criarUsuario;

    private final ListarUsuario listarUsuario;

    public UsuarioController(CriarUsuario criarUsuario, ListarUsuario listarUsuario) {
        this.criarUsuario = criarUsuario;
        this.listarUsuario = listarUsuario;
    }

    @GetMapping
    public List<UsuarioResponse> listarUsuarios(){
        List<Usuario> usuarios = listarUsuario.listarUsuarios();
        return usuarios.stream().map(usuario ->
            new UsuarioResponse(usuario.getCpf(), usuario.getNome(), usuario.getNascimento(), usuario.getEmail())
        ).collect(Collectors.toList());
    }

    @PostMapping
    public UsuarioResponse cadastrarUsuario(@RequestBody UsuarioRequest request){
        Usuario salvo = criarUsuario.criarUsuario(new Usuario(request.getCpf(), request.getNome(), request.getNascimento(), request.getEmail()));
        return new UsuarioResponse(salvo.getCpf(), salvo.getNome(), salvo.getNascimento(), salvo.getEmail());
    }
}
