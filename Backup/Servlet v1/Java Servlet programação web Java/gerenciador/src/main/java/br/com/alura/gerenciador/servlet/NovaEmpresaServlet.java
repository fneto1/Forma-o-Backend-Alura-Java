package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class NovaEmpresaServlet
 */

//esse script recebe o form de cadastro de nome de empresa

//@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

		
		//PrintWriter out = response.getWriter();
		//out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");
		request.setAttribute("empresa", empresa.getNome());
		response.sendRedirect("listaEmpresas");
		
		//chamando o JSP
//		RequestDispatcher rd = request.getRequestDispatcher("listaEmpresas");
//		request.setAttribute("empresa", empresa.getNome());
//		rd.forward(request, response);
		
		
	}

}
