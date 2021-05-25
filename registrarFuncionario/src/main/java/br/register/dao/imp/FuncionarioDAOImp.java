package br.register.dao.imp;

import java.io.Serializable;
import java.util.List;

import br.register.bean.Funcionario;
import br.register.dao.FuncionarioDAO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class FuncionarioDAOImp implements FuncionarioDAO, Serializable{
	
	@PersistenceContext
    protected EntityManager entityManager;
	
	public FuncionarioDAOImp(EntityManager em) {
		this.entityManager = em;
	}
	
	public void addFuncionario(Funcionario funcionario) {
		entityManager.persist(funcionario);
	}
	
	public Funcionario getFuncionario(int id) {
		return getTodosFuncionarios().get(id);
	}

	public void removerFuncionario(int id) {
		entityManager.remove(getFuncionario(id));
	}

	public void updateFuncionario(Funcionario funcionario) {
		entityManager.merge(funcionario);
	}

	public List<Funcionario> getTodosFuncionarios() {
		return entityManager.createQuery("SELECT funcionario FROM Funcionario funcionario", Funcionario.class).getResultList();
	}
}
