package br.proje.jdbc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.proje.jdbc.dao.PessoaDAO;
import br.proje.usu.PessoaDTO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/user-login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {

			String email = request.getParameter("EMAIL");
			String passoword = request.getParameter("SENHA");

			PessoaDAO pessoaDAO = new PessoaDAO();
			PessoaDTO pessoaDTO = pessoaDAO.pessoaLogin(email, passoword);
			
			System.out.println(email + passoword);
			if (pessoaDTO != null) {
				request.getSession().setAttribute("auth", pessoaDTO);
				response.sendRedirect("index.jsp");

			} else {
				out.print("Falha No Login");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
