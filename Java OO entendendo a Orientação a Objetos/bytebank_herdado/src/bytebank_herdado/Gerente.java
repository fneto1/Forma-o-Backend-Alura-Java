package bytebank_herdado;

//o gerente é um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
		
	
	public double getBonificacao() {
		return super.getSalario();
		//diferente do this que olha para o atributo presente na classe, o super indica que o atributo está na classe mãe
	}

	private AutenticacaoUtil autenticador;
	
	public Gerente(){
		 this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
 
	}
		
	
}