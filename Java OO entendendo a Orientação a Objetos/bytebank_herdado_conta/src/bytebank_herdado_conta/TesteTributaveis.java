package bytebank_herdado_conta;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1337, 3958);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(seguro);
		calc.registra(cc);
		
		System.out.println(seguro.getValorImposto());
		System.out.println(cc.getValorImposto());
	}

}
