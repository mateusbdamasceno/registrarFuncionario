package br.register.bean;

import javax.persistence.Id;

import lombok.Data;

@Data
public class Funcionario {
	@Id
	private Integer id;
	private String name;
	private String endereco;
	private String cpf;
	private String telefone;
	private String cargo;
	private String nivel;

}
