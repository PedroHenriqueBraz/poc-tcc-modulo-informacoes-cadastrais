package com.gsl.informacoescadastrais.mock.legado.repository;

import com.gsl.informacoescadastrais.mock.legado.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
