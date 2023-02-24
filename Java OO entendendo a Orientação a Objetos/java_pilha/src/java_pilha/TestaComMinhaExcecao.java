package java_pilha;

public class TestaComMinhaExcecao {

	public static void main(String[] args) {
			
		Conta c = new Conta();
		
		try {
		c.deposita();
		} catch (MinhaExcecao ex) {
			ex.printStackTrace();
		}
		
	}

}
