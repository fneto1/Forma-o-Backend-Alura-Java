package br.com.alura.gerenciador.modelo;

import java.util.Date;

//o modelo representa o bd

public class Empresa {
	
	private int id;
	private String nome;
	private Date dataAbertura = new Date();
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataAbertura() {
		return this.dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	
}
