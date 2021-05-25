package br.register.services;

import br.register.bean.Funcionario;

public interface FuncionarioService {

	Object getAll();

	Funcionario insertFuncionario(Funcionario funcionario);

	void delete(int id);

	public Funcionario updateFuncionario(Funcionario funcionario);

}
