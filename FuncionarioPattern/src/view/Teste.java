package view;

import controller.ContratacaoFactory;
import controller.ContratacaoIntegral;
import controller.ContratacaoParcial;
import controller.ContratacaoTemporaria;
import model.Funcionario;

public class Teste {

	public static void main(String[] args) {
		Funcionario func = null;
		ContratacaoFactory contrataIntegral = new ContratacaoIntegral();
		
		func = contrataIntegral.Contratacao();
		System.out.println(func.toString());
		
		ContratacaoFactory contrataParcial = new ContratacaoParcial();
		func = contrataParcial.Contratacao();
		System.out.println(func.toString());
		
		ContratacaoFactory contrataTemporario = new ContratacaoTemporaria();
		func = contrataTemporario.Contratacao();
		System.out.println(func.toString());
	
	}

}
