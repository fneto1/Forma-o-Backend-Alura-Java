package bytebank_herdado;

public class TestaSistema {
	
	public static void main(String[] args) {
		
		Autenticavel tiringa = new Gerente();
		
		tiringa.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(1337);

		SistemaInterno si = new SistemaInterno();
		
		si.autentica(tiringa);
		si.autentica(adm);
	}
}
