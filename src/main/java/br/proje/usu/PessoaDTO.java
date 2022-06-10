package br.proje.usu;

public class PessoaDTO {

	private int id_pessoa;
	
	private String nome;
	private String telefone;
	private String email;
	private String senha;
	public PessoaDTO() {
		
	}
	
	public PessoaDTO(int id_pessoa, String nome, String telefone, String email, String senha) {
		super();
		this.id_pessoa = id_pessoa;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
	}
	
	public int getId_pessoa() {
		return id_pessoa;
	}
	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
