package bytebank_herdado;

public class ControleBonificacao {
	
	private double soma;
	
	//criando um método
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
