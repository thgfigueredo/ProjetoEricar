package br.proje.jdbc.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.proje.jdbc.dao.PessoaDAO;
import br.proje.usu.PessoaDTO;



@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {						
		
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String nome = request.getParameter("Nome");
	String telefone = request.getParameter("Telefone");
	String email = request.getParameter("Email");
	String senha = request.getParameter("Senha");
	
	PessoaDTO pessoaDTO = new PessoaDTO(nome, email, telefone, senha);
	
	//BANCO.adicional(usuario) ----> RETIRADO DO SIMULADOR 
	PessoaDAO pessoaDAO = new PessoaDAO();
	pessoaDAO.cadastrar(pessoaDTO);
	
	PessoaDTO.adiciona(usuario);
	
	//redireciona CLIENT SIDE
	response.sendRedirect("mostrar");
	
	}
	
	private Date converterParaDate(String dataComoString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date dataFormatada = null;
		
			try {
				dataFormatada = sdf.parse(dataComoString);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		return dataFormatada;
	}
	
}
