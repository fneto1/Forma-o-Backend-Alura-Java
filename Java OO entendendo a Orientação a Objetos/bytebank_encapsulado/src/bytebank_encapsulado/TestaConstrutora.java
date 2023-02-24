package bytebank_encapsulado;

public class TestaConstrutora {
	
	public static void main(String[] args) {
		Conta contaDoCobra = new Conta (1337, 3895);
		
		System.out.println(contaDoCobra.getAgencia());
		
		Conta contaDoCobra2 = new Conta (1337, 33895);
		
		System.out.println(Conta.getTotal());
	}
	
	
	
}
