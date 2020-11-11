package contrato;

public class ContratoComissionado extends Contrato{
	
	private float percComissao;
	private float ajudaCusto;
	
	public float calcVencimento(float vlFaturam) {
		
		return vlFaturam;
	}

}
