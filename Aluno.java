import java.util.ArrayList;
import java.util.Date;


public class Aluno {
	private String nome;
	private String cpf;
	private Date DataNascimento;
	private ArrayList<Treino> treinos;
	
	public Aluno() {
		treinos = new ArrayList<Treino>();
	}
	
	public void addTreino(Treino t) {
		treinos.add(t);
	}
	public void removeTreino(Treino t) {
		treinos.remove(t);
	}
	
	public ArrayList<Treino> getTreino(){
		return treinos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(Date DataNascimento) {
		this.DataNascimento = DataNascimento;
	}
	
}
