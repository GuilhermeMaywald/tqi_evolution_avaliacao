package br.com.tqi.credito.controller;

import br.com.tqi.credito.model.Cliente;
import br.com.tqi.credito.model.Login;
import br.com.tqi.credito.repository.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * Classe utilizada para gerenciar login.
 * @author Guilherme Maywald
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    private ClienteRepository repository;

    LoginController(ClienteRepository clienteRepository) {
        this.repository = clienteRepository;
    }
    /**
     * Metodo usado para login de clientes
     *
     * @param {email} {senha}
     * @return
     */


    @PostMapping
    public ResponseEntity<String> create(@RequestBody Login login){
        Cliente cliente = repository.findByCpf(login.getCpf());

        try {
            if (login.getCpf().equals(cliente.getCpf()) && login.getSenha().equals(cliente.getSenha())) {
                return ResponseEntity.status(200).body("{ Cliente logado com sucesso: " + cliente.getNome() + " } ");
            } else {
                return ResponseEntity.status(401).body("{ Acesso negado } ");
            }
        } catch (Exception e) {
            return ResponseEntity.status(401).body("{ Acesso negado } ");
        }

    }
}
