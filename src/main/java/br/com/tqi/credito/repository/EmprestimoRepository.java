package br.com.tqi.credito.repository;


import br.com.tqi.credito.model.Emprestimo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface EmprestimoRepository extends CrudRepository<Emprestimo, Long> {
    Optional<Emprestimo> findByCpfAndId(String cpf, Long Id);
    List<Emprestimo> findAllByCpf(String cpf);
    Emprestimo findByCpf(String cpf);

}