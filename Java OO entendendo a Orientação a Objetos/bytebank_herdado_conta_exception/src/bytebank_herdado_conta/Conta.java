package bytebank_herdado_conta;

public abstract class Conta {
	
	//atributos da classe
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	//construtor
	public Conta (int agencia, int numero) {
		//Conta.total++;
		//System.out.println("Total de contas: " +Conta.total);
		this.agencia = agencia;
		this.numero = numero;
	}
	
	//métodos	
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException {
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo" + this.saldo + ", Valor:" + valor);
		}
		
		this.saldo -= valor;
	}
	
	public void transefere(double valor, Conta destino) throws SaldoInsuficienteException{
			this.saca(valor);
			destino.deposita(valor);
	}
	
	//getters e setters
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Digite um numero maior que 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Digite um numero maior que 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
