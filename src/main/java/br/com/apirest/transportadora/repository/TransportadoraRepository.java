package br.com.apirest.transportadora.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.transportadora.datasource.model.Transportadora;


public interface TransportadoraRepository extends JpaRepository<Transportadora, Long> {
	
	List<Transportadora> findByNomeContainingOrUfOrCidadeOrModal(String nome, String uf, String cidade, String modal);

}
