package secao12;

public class Professor extends Pessoa {
	private String matricula;
	
	public Professor(String nome, int ano_nasc, String email, String matricula) {
		super(nome, ano_nasc, email);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		return super.toString() + "\nMatricula: " + this.matricula; 
	}
	
	public String getNome() {
		return "Professor: \n" + super.getNome();
	}

	@Override
	public void mensagem(String texto) {
		// TODO Auto-generated method stub
		System.out.println(texto);
	}
	
}
