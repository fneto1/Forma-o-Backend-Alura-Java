package sintaxe_variaveis_e_fluxo;

public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1234.55;
		int valor = (int) salario; //casting
		
		System.out.println(valor);
		
		long numeroGrande = 6756439828l;
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		double total = valor1 + valor2;
		
		System.out.println(total);
	}
}
