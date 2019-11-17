package br.com.apirest.transportadora.datasource.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transportadoras")
public class Transportadora implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7839123663478279954L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "empresa")
	private String empresa;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "whatsapp")
	private String whatsapp;
	
	@Column(name = "celular")
	private String celular;
	
	@Column(name = "modal")
	private String modal;
	
	@Column(name = "rua")
	private String rua;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "uf")
	private String uf;
	
	@Column(name = "cep")
	private String cep;
	
	@Column(name = "logo")
	private String logo;
	
	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Transportadora(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
}
