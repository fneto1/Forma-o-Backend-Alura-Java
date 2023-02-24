package bytebank_herdado;

//contrato Autenticavel
	//quem assina esse contrato, precisa implementar
		//método setSenha
		//método autentica

public abstract interface Autenticavel {

	public void setSenha(int senha);
	
	public boolean autentica(int senha);
}
