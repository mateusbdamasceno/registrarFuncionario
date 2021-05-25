package br.register.dao;

import java.util.List;

import br.register.bean.Funcionario;

public interface FuncionarioDAO {

	void addFuncionario(Funcionario funcionario);

	void removerFuncionario(int id);

	List<Funcionario> getTodosFuncionarios();

	void updateFuncionario(Funcionario funcionario);


}
