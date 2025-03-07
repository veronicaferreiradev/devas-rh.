package com.devasrh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_funcionarios")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome do funcionário é obrigatório!")
	@Size(min = 5, max = 100, message = "O nome do funcionário tem que ser maior que 5 e menor que 100!")
	private String nome;
	
	@NotBlank(message = "O email do funcionário é obrigatório!")
	private String email;
	
	@NotBlank(message = "O cpf do funcionário é obrigatório!")
	private String cpf;
	
	@NotBlank(message = "A data de admissão do funcionário é obrigatório!")
	private String dataadmissao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataadmissao() {
		return dataadmissao;
	}

	public void setDataadmissao(String dataadmissao) {
		this.dataadmissao = dataadmissao;
	} 

}
