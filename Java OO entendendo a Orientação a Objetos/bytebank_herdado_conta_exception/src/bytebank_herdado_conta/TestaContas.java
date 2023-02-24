package bytebank_herdado_conta;

public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(1337, 2747);
		cc.deposita(500);
		
		ContaPoupanca cp = new ContaPoupanca(6637, 1845);
		cp.deposita(300);
		
		cc.transefere(50, cp);
		
		System.out.println("Saldo da conta corrente: " +cc.getSaldo());
		System.out.println("Saldo da conta poupança: " +cp.getSaldo());
	}

}
