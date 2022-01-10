package br.com.tqi.credito.controller;


import br.com.tqi.credito.model.Emprestimo;
import br.com.tqi.credito.repository.EmprestimoRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Classe utilizada para gerenciar os clientes.
 * @author Guilherme Maywald
 */
@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    private static final Logger logger = LogManager.getLogger(EmprestimoController.class);

    private EmprestimoRepository repository;

    EmprestimoController(EmprestimoRepository emprestimoRepository) {
        this.repository = emprestimoRepository;
    }
    /**
     * Metodo Utilizado para listar os emprestimos de um CPF
     * @param {cpf}
     * @return Emprestimo
     */

    @GetMapping(path = {"/{cpf}"})
    public List<Emprestimo> findByCPF(@PathVariable String cpf){
        return repository.findByCpf(cpf);
    }

    /**
     * Metodo Utilizado para listar os emprestimos de um CPF
     * @param {cpf} CPF do cliente
     * @param {codigo} ID do emprestimo
     * @return Dados do emrprestimo solicitado
     */
    @GetMapping(path = {"/{cpf}/{codigo}"})
    public Optional<Emprestimo> detailEmprestimo(@PathVariable Long codigo){
        return  repository.findById(codigo);
    }

    /** Metodo utilizado para gravar o novo emprestimo
     * @param emprestimo
     *
     */
    @PostMapping
    public Emprestimo create(@RequestBody Emprestimo emprestimo){
        return repository.save(emprestimo);
    }
}
