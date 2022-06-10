package br.proje.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {

	
	
		private static ConexaoUtil conexaoUtil;
		
		public static  ConexaoUtil getInstance() {
			if (conexaoUtil == null) {
				conexaoUtil = new ConexaoUtil();
			}
			return conexaoUtil;
		}

		public Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Conectado");
			return DriverManager.getConnection("jdbc:mysql://localhost/PROJETO?useTimezone=true&serverTimezone=UTC","root","root");
		}

		public static void main (String []args) {
			try {
				System.out.println(getInstance().getConnection());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
