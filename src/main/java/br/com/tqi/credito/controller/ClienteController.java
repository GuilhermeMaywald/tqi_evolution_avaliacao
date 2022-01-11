package br.com.tqi.credito.controller;

import br.com.tqi.credito.model.Cliente;
import br.com.tqi.credito.repository.ClienteRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Classe utilizada para gerenciar os clientes.
 * @author Guilherme Maywald
 */
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private static final Logger logger = LogManager.getLogger(ClienteController.class);

    private ClienteRepository repository;

    ClienteController(ClienteRepository clienteRepository) {
        this.repository = clienteRepository;
    }

    /**
     * Metodo usado para listar clientes
     * param {cpf} CPF do Cliente
     * return dados do cliente
     * @return
     */

    @GetMapping(path = {"/{cpf}"})
    public Cliente findByCPF(@PathVariable String cpf){
         return repository.findByCpf(cpf);
    }

    /**
     * Metodo usado para cadastrar clientes
     *
     * @param cliente
     */

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }
}
