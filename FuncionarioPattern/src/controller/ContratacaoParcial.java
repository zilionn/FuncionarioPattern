package controller;

import model.Funcionario;
import model.FuncionarioParcial;

public class ContratacaoParcial extends ContratacaoFactory {

	public ContratacaoParcial() {
		super();
	}

	@Override
	public Funcionario Contratacao() {
		FuncionarioParcial func = new FuncionarioParcial();
		func.setHoraEntrada("10:30");
		func.setHoraSaida("18:30");
		func.setId("123456");
		func.setNome("Germanotta");
		func.setSalario(2000.0f);
		return func;
	}

}
