package secao12;
/* Beneficios da herença
   
  Evita repetição de código
  Facilita a manutenção do programa
  ...
 */
public class Aluno extends Pessoa{//Aluno é uma Pessoa, ele herda todos os componentes de Pessoa

	private String ra;
	
	public Aluno(String nome, int ano_nasc, String email, String ra) {
		super(nome, ano_nasc, email);
		this.ra = ra;
	}
	
	
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public String toString() {
		return super.toString() + "\nR.A: " + this.ra; 
	}
	
	public String getNome() {
		return "Aluno: \n" + super.getNome();
	}


	@Override
	public void mensagem(String texto) {
		// TODO Auto-generated method stub
		System.out.println(texto);
	}
	
	
}
