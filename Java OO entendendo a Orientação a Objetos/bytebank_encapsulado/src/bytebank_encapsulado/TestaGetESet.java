package bytebank_encapsulado;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta contaDoCobra = new Conta(1337, 6666);
		
		contaDoCobra.deposita(822);
		
		System.out.println(contaDoCobra.getSaldo());
		
		contaDoCobra.setNumero(1337);
		
		System.out.println(contaDoCobra.getNumero());
		
		Cliente cobra = new Cliente();
		cobra.setNome("Cobra Silva");
		
		contaDoCobra.setTitular(cobra);
		
		System.out.println(contaDoCobra.getTitular().getNome());
		
		contaDoCobra.getTitular().setProfissao("Programador");
	}
}
