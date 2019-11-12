package br.com.apirest.transportadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.transportadora.datasource.model.Transportadora;


public interface TransportadoraRepository extends JpaRepository<Transportadora, Long> {

}
