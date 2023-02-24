package bytebank_herdado;

public class TesteGerente {
	
	public static void main(String[] args) {
		
		Autenticavel boris = new Gerente();
		
		Gerente DonPollo = new Gerente();
		DonPollo.setNome("Don Pollo");
		DonPollo.setCpf("36216637-01");
		DonPollo.setSalario(5000);
		DonPollo.setSenha(1234);
		
		boolean autenticou = DonPollo.autentica(12345);
		
		System.out.println(DonPollo.getNome());
		System.out.println(DonPollo.getCpf());
		System.out.println(DonPollo.getSalario());
		System.out.println(autenticou);
		System.out.println(DonPollo.getBonificacao());
	}

}
