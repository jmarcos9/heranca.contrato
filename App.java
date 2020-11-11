package contrato;

import java.util.Date;

public class App {
	
	public static void main(String[] args) {
		
		Colaborador colaborador = new Colaborador("1111", "03586777426" 
												, "marcos", false);
		
		colaborador.validarCpf(colaborador.getCpf());
		
		colaborador.imprimeCpf(colaborador.getCpf());
	}
	
	

}
