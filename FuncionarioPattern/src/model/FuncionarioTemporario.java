package model;

public class FuncionarioTemporario extends Funcionario{
	
	private int dia;
	private int mes;
	private int ano;

	public FuncionarioTemporario() {
		super();
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return "O funcionário " + getNome() + " detentor do ID " + getId() + " e do salário de R$" + getSalario() + " irá trabalhar até a data de " + dia + "/" + mes + "/" + ano;
	}

}
