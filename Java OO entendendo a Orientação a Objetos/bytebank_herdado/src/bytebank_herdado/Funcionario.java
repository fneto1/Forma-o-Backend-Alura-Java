package bytebank_herdado;

//não podemos mais instanciar objetos com a classe funcionario
public abstract class Funcionario {
	
	//declarando os atributos
	private String nome;
	private String cpf;
	private double salario;
	
	//construtor
	
	
	//método
	
	//método sem corpo, não há implementação
	public abstract double getBonificacao();
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
