package bytebank_herdado;

public class TestaReferencias {

	public static void main(String[] args) {
		
		Funcionario tiringa = new Gerente();
		
		tiringa.setNome("Tiringa");
		tiringa.setSalario(8000);
		
		
		Funcionario charles = new EditorVideo();
		charles.setSalario(4000);
		
		Funcionario peinha = new Designer();
		peinha.setSalario(3000);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(tiringa);
		controle.registra(charles);
		controle.registra(peinha);
		
		System.out.println(controle.getSoma());
		

	}

}
