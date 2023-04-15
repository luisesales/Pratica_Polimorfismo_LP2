import java.util.ArrayList;

public class Professor extends Funcionario{
	private String tipo;
	private ArrayList<Aluno> alunos;
	
	public Professor() {
		alunos = new ArrayList<Aluno>();
	}

	public void addAluno(Aluno a) {
		alunos.add(a);
	}
	public void removeAluno(Aluno a) {
		alunos.remove(a);
	}
	public ArrayList<Aluno> getAlunos(){
		return alunos;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
