package model;

public class FuncionarioParcial extends Funcionario {
	
	private String horaEntrada;
	private String horaSaida;

	public FuncionarioParcial() {
		super();
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	@Override
	public String toString() {
		return "O funcionário " + getNome() + " detentor do ID " + getId() + " e do salário de R$" + getSalario() + " entra às " + horaEntrada + " e sai às " + horaSaida;
	}
	
	

}
