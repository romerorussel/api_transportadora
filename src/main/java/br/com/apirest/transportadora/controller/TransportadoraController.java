package br.com.apirest.transportadora.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.transportadora.datasource.model.Transportadora;
import br.com.apirest.transportadora.repository.TransportadoraRepository;

@RestController
@RequestMapping(value = "/api")
public class TransportadoraController {
	
	@Autowired
	private TransportadoraRepository transportadoraRepository;
	
	@GetMapping(path = "/transportadoras")
	public List<Transportadora> buscarTransportadoras(){
		List<Transportadora> listaTransportadoras = transportadoraRepository.findAll();
		return listaTransportadoras;
	}
	
	@GetMapping(path = "/transportadora/{id}")
	public Optional<Transportadora> buscarTransportadoraPorId(
			@PathVariable (name = "id", required = true)
			Long id){
		
		return transportadoraRepository.findById(id);
	}
	
	@PostMapping(path = "/transportadora/cadastrar")
	public void cadastrarTransportadora(@RequestBody Transportadora transportadora){
		transportadoraRepository.save(transportadora);
	}
	
	@DeleteMapping(path = "/transportadora/deletar/{id}")
	public void deletarTransportadora(@PathVariable (name = "id", required = true) Long id){
		transportadoraRepository.deleteById(id);
	}

}
