package controller;

import model.Funcionario;
import model.FuncionarioIntegral;

public class ContratacaoIntegral extends ContratacaoFactory {

	public ContratacaoIntegral() {
		super();
	}

	@Override
	public Funcionario Contratacao() {
		FuncionarioIntegral func = new FuncionarioIntegral();
		func.setbHoras(50);
		func.setId("123456");
		func.setNome("Gaga");
		func.setSalario(1500.00f);
		return func;
	}

}
