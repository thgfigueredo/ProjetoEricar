package br.proje.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.proje.jdbc.ConexaoUtil;
import br.proje.usu.PessoaDTO;

public class PessoaDAO {
	private ResultSet result;
	public void inserir (PessoaDTO pessoaDTO) {
		
		try {
		
		Connection connection = ConexaoUtil.getInstance().getConnection();
		
		String sql = "INSERT INTO CLIENTE(ID_PESSOA, NOME, TELEFONE, EMAIL, SENHA) VALUES (?, ?, ?, ?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1, pessoaDTO.getId_pessoa());
		statement.setString(2, pessoaDTO.getNome());
		statement.setString(3, pessoaDTO.getTelefone());
		statement.setString(4, pessoaDTO.getEmail());
		statement.setString(5, pessoaDTO.getSenha());
		
		
		
		statement.execute();
		
		
		connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public PessoaDTO pessoaLogin(String email, String senha) {
		PessoaDTO pessoa= null;
		
		
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			String query= "SELECT * FROM users WHERE EMAIL=? and SENHA=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, email);
			statement.setString(2, senha);
			
			
			result = statement.executeQuery();
			
			if (result.next()) {
				pessoa = new PessoaDTO();
				pessoa.setId_pessoa(result.getInt("ID_PESSOA"));
				
				pessoa.setEmail(result.getString("EMAIL"));
				
				pessoa.setNome(result.getString("NOME"));
				pessoa.setSenha(result.getString("SENHA"));
				pessoa.setTelefone(result.getString("TELEFONE"));
			
				
				
				
				
				
				
			}
			
			
			connection.close();
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		return pessoa;
		
	}
}


	



	
	



