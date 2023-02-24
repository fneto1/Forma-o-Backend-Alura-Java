package bytebank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		
		//Criando novo cliente
		Cliente cobra = new Cliente();
		cobra.nome = "Cobra Silva";
		cobra.cpf = "012.345.678-99";
		cobra.profissao = "Engenheiro civil";
		
		//criando nova conta
		Conta contaDoCobra = new Conta();
		contaDoCobra.deposita(100);
		
		//armazenando a classe cliente 
		contaDoCobra.titular = cobra;
		/*
		 ou
		 contaDoCobra.titular = new Cliente();
		 contaDaCobra.titular.nome = "Cobra Silva";
		 */
		
		System.out.println(contaDoCobra.titular.nome);
		
		System.out.println(contaDoCobra.getSaldo());
	}
}
