package bytebank_herdado_conta;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1337, 3895);
		conta.deposita(1000);
		
		try {
			conta.saca(1200);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Ex.:" + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}
