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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

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
	@ResponseBody
	public String cadastrarTransportadora(
			@RequestBody Transportadora transportadora){
		String response;
		try{
			transportadoraRepository.save(transportadora);
			response = "{\"success\":1}";
		}catch(Exception e){
			response = "{\"success\":0}";
		}
		return response;
	}
	
	@DeleteMapping(path = "/transportadora/deletar/{id}")
	@ResponseBody
	public String deletarTransportadora(@PathVariable (name = "id", required = true) Long id){
		String response;
		try{
			transportadoraRepository.deleteById(id);
			response = "{\"success\":1}";
		}catch(Exception e){
			response = "{\"success\":0}";
		}
		return response;
	}
	
	@PostMapping(path = "/transportadora/atualizar/{id}")
	@ResponseBody
	public String atualizarTransportadora(
			@RequestBody Transportadora transportadora,
			@PathVariable (name = "id", required = true) Long id){
		
		String response;
		try{
			//Recupera o registro do banco de dados a ser atualizado
			Transportadora transportadoraAtualizar = transportadoraRepository.getOne(id);
			
			//Monta o objeto com os novos dados
			transportadoraAtualizar.setBairro(transportadora.getBairro());
			transportadoraAtualizar.setCelular(transportadora.getCelular());
			transportadoraAtualizar.setCep(transportadora.getCep());
			transportadoraAtualizar.setCidade(transportadora.getCidade());
			transportadoraAtualizar.setEmail(transportadora.getEmail());
			transportadoraAtualizar.setEmpresa(transportadora.getEmpresa());
			transportadoraAtualizar.setLogo(transportadora.getLogo());
			transportadoraAtualizar.setModal(transportadora.getModal());
			transportadoraAtualizar.setNome(transportadora.getNome());
			transportadoraAtualizar.setNumero(transportadora.getNumero());
			transportadoraAtualizar.setRua(transportadora.getRua());
			transportadoraAtualizar.setTelefone(transportadora.getTelefone());
			transportadoraAtualizar.setUf(transportadora.getUf());
			transportadoraAtualizar.setWhatsapp(transportadora.getWhatsapp());
			
			//Salva o novo objeto
			transportadoraRepository.save(transportadoraAtualizar);
			
			response = "{\"success\":1}";
		}catch(Exception e){
			response = "{\"success\":0}";
		}
		return response;
	}
}
