package bytebank_herdado;

//o extends herda as caracteristicas de uma classe
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		return 200;
		//diferente do this que olha para o atributo presente na classe, o super indica que o atributo está na classe mãe
	}
}