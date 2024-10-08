package br.com.AppRH2.AppRH2.models;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Entity
public class Dependentes {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(unique=true)
	private String cpf;
	
	private String nome;
	private String dataNascimento;
	
	@ManyToOne
	private Funcionario funcionario;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDatanascimento() {
		return dataNascimento;
	}

	public void setDatanascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	

}
