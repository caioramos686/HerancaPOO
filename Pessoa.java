package secao12;

//Classe base de Aluno

public abstract class Pessoa {
	private String nome;
	private int ano_nasc;
	private String email;
	//fica em private so para poder ser manipulado dentro dessa classe 
	
	public Pessoa(String nome, int ano_nasc, String email) {
		this.nome = nome;
		this.ano_nasc = ano_nasc;
		this.email = email;
	}
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNome() {//retorna o tipo de dado
		return this.nome;
	}
	
	public void setNome(String nome) {//insere o valor 
		this.nome = nome;
	}
	
	public int getAnoNasc() {
		return this.ano_nasc;
	}
	
	public void setAnoNasc(int ano_nasc) {
		this.ano_nasc = ano_nasc;
	}
	
	public String toString() {
		return "Nome: " +  this.nome + "\nAno Nascimento: " + this.ano_nasc;
	}
	
	//declaração de um método abstrato
	public abstract void mensagem(String texto);
	
	
	
}
