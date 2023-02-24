package bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente Cobra = new Gerente();
		
		Cobra.setNome("Cobra Silva Sauro");
		Cobra.setCpf("063.124.185-02");
		Cobra.setSalario(4400);
		
		System.out.println(Cobra.getNome());
		System.out.println(Cobra.getBonificacao());
	}

}
