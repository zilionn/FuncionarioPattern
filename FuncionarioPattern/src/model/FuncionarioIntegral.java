package model;

public class FuncionarioIntegral extends Funcionario {
	
	private int bHoras;

	public FuncionarioIntegral() {
		super();
	}

	public int getbHoras() {
		return bHoras;
	}

	public void setbHoras(int bHoras) {
		this.bHoras = bHoras;
	}

	@Override
	public String toString() {
		return "O funcionário " + getNome() + " detentor do ID " + getId() + " e do salário de R$" + getSalario() + " tem um banco de horas de: " + bHoras + " horas";
	}
}
