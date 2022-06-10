package br.proje.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ConexaoUtil {

	private static String usuario;
    private static String senha;
	
		private static ConexaoUtil conexaoUtil;
		
		public static  ConexaoUtil getInstance() {
			if (conexaoUtil == null) {
				conexaoUtil = new ConexaoUtil();
			}
			return conexaoUtil;
		}

		public Connection getConnection() throws ClassNotFoundException, SQLException {
			if (usuario == null && senha == null) {
	            Scanner sc = new Scanner(System.in);

	            System.out.println("Digite seu Usuario e Senha no Banco de Dados");
	            usuario = sc.nextLine();

	         
	            senha = sc.nextLine();
	            sc.close();
			}
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Conectado");
			return DriverManager.getConnection("jdbc:mysql://localhost/PROJETO?useTimezone=true&serverTimezone=UTC",usuario,senha);
		}

		public static void main (String []args) {
			try {
				System.out.println(getInstance().getConnection());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
