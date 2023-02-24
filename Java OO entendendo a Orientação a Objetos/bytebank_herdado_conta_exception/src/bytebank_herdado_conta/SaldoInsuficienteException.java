package bytebank_herdado_conta;

public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}

//acredito que o super va acessar de quem ele herda, o RuntimeException