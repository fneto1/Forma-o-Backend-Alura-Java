package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		if(idade >=18) {
			System.out.println("Você é um adulto");
		} else if(quantidadePessoas >=2) {
			System.out.println("Você não é um adulto, mas pode entrar");
		} else {
			System.out.println("Você não é um adulto");
		}
	}
}
