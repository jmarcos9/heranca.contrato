package contrato;

import java.util.Date;

public class ContratoHorista extends Contrato {

	private int horasMes;
	private float valorHora;

	public ContratoHorista(int id, Date dataInicio, Date dataEncerramento, Colaborador colaborador, boolean ativo,
			int horasMes, float valorHora) {
		super(id, dataInicio, dataEncerramento, colaborador, ativo);
		this.horasMes = horasMes;
		this.valorHora = valorHora;
	}

	public int getHorasMes() {
		return horasMes;
	}

	public void setHorasMes(int horasMes) {
		this.horasMes = horasMes;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public float calcVencimento() {
		float calc = 0;
		return calc;
	}

}
