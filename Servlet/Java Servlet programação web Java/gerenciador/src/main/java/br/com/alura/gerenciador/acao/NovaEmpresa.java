package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresa implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		
		System.out.println("Cadastrando nova empresa");
		
		//armazenando o parametro "nome" do input passado via POST 
		String nomeEmpresa = request.getParameter("nome");
		
		//armazenando o parametro "data" do input passado via POST 
		String paramDataEmpresa = request.getParameter("data");
		
		Date dataAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		//instanciando um objeto Empresa para armazenar o nome da empresa
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		//instanciando um objeto Banco para armazenar numa lista os nomes das empresas
		Banco banco = new Banco();
		banco.adiciona(empresa);

		
		request.setAttribute("empresa", empresa.getNome());
		return "redirect:entrada?acao=ListaEmpresas";
		
	}

}
