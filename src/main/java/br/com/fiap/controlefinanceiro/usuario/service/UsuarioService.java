package br.com.fiap.controlefinanceiro.usuario.service;

import br.com.fiap.controlefinanceiro.usuario.Usuario;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UsuarioService {


    public List<Usuario> listar() {
        return List.of(
                new Usuario(1L, "Romeu", "romeu@email.com", LocalDate.of(1998, 5, 15)),
                new Usuario(2L, "Debora", "debora@email.com", LocalDate.of(2003, 6, 10)),
                new Usuario(3L, "Fabio", "fabio@email.com", LocalDate.of(1985, 10, 23))
        );
    }
}
