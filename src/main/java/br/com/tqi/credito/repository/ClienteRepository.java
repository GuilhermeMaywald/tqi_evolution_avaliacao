package br.com.tqi.credito.repository;

import br.com.tqi.credito.model.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    Cliente  findByCpf(String cpf);
    Cliente  findByEmail(String email);

}

