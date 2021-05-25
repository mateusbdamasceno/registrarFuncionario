package br.register.service.imp;

import java.util.ArrayList;
import br.register.bean.Funcionario;
import br.register.dao.FuncionarioDAO;
import br.register.services.FuncionarioService;

public class FuncionarioServiceImp implements FuncionarioService{
	
	private FuncionarioDAO dao;

	public ArrayList<Funcionario> getAll() {
		return (ArrayList<Funcionario>) dao.getTodosFuncionarios();
	}

	public Funcionario insertFuncionario(Funcionario funcionario) {
		dao.addFuncionario(funcionario);
		return funcionario;
	}
	
	public Funcionario updateFuncionario(Funcionario funcionario) {
		dao.updateFuncionario(funcionario);
		return funcionario;
	}

	public void delete(int id) {
		dao.removerFuncionario(id);
	}

}
