package controller;

import model.Funcionario;
import model.FuncionarioTemporario;

public class ContratacaoTemporaria extends ContratacaoFactory {

	public ContratacaoTemporaria() {
		super();
	}

	@Override
	public Funcionario Contratacao() {
		FuncionarioTemporario func = new FuncionarioTemporario();
		func.setAno(2024);
		func.setDia(30);
		func.setMes(10);
		func.setNome("Stefani");
		func.setSalario(1758.50f);
		func.setId("987654321");
		return func;
	}

}
