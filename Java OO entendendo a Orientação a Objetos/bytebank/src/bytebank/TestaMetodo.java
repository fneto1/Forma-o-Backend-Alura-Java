package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.saca(30);
		
		System.out.println(contaDoPaulo.saldo);
		
		Conta contaDoCobra = new Conta();
		
		contaDoCobra.deposita(1000);
		
		System.out.println(contaDoCobra.saldo);
		
		if(contaDoCobra.transefere(80, contaDoPaulo)) {
			System.out.println("Transferencia realizada com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(contaDoCobra.saldo);
		
		System.out.println(contaDoPaulo.saldo);
	}
}
