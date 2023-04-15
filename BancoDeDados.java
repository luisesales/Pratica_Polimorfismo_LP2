import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BancoDeDados {
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Professor> professores;
	private ArrayList<Recepcionista> recepcionistas;
	private ArrayList<Aluno> alunos;
	private SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
	
	
	public BancoDeDados() {
		funcionarios = new ArrayList<Funcionario>();
		professores = new ArrayList<Professor>();
		recepcionistas = new ArrayList<Recepcionista>();
		alunos = new ArrayList<Aluno>();
	}
	
	public void addProfessor(Professor p) {
		professores.add(p);
		funcionarios.add(p);
	}
	public void removeProfessor(Professor p) {
		professores.remove(p);
		funcionarios.remove(p);
	}
	public void addRecepcionista(Recepcionista r) {
		recepcionistas.add(r);
		funcionarios.add(r);
	}
	public void removeRecepcionista(Recepcionista r) {
		recepcionistas.remove(r);
		funcionarios.remove(r);
	}
	public void addAluno(Aluno a) {
		alunos.add(a);		
	}
	public void removeAluno(Aluno a) {
		alunos.remove(a);
	}
	public int calcularIdade(Date dataNascimento, Date dataAtual) {
		
		int d1 = Integer.parseInt(formato.format(dataNascimento));                            
	    int d2 = Integer.parseInt(formato.format(dataAtual));                          
	    return (d2 - d1) / 10000;
	}
	
	public void listFuncionarios() {
		System.out.println("############## Funcionários #############################");
		for(Funcionario f : funcionarios) {
			System.out.println("Matrícula: "+ String.format("%03d",f.getMatricula()) + " Nome.: " + f.getNome() + " Tipo.: " + f.getClass());
		}
		System.out.println("#########################################################");
	}
	public void listProfessores() {
		ArrayList<Aluno> alunosV = new ArrayList<Aluno>(); 
		ArrayList<Treino> treinosV = new ArrayList<Treino>();
		System.out.println("############## Professores ##############################");
		for(Professor p : professores) {
			System.out.println("Professor ["+p.getNome()+"]");
			alunosV = p.getAlunos();
			for(Aluno a : alunosV) {				
				System.out.print("Aluno >>> "+ a.getNome() + " { ");
				treinosV = a.getTreino();
				for(Treino t : treinosV) {
					System.out.print(t.getHorario()+ "=" + t.getAtividade() + ", ");
				}
				System.out.println("}");
			}
		}
		System.out.println("#########################################################");
	}
	public void listRecepcionistas() {
		System.out.println("############## Recepcionistas ###########################");
		ArrayList<Horario> horariosV = new ArrayList<Horario>();
		for(Recepcionista r : recepcionistas) {
			horariosV = r.getHorarios();
			System.out.print("Nome.: " + r.getNome() + " { ");
			for(Horario h : horariosV) {
				System.out.print(h.getDia() + "=" + h.getHora() + ", ");
			}
			System.out.println("}");
		}
		System.out.println("#########################################################");
	}
	public void listAlunos() {
		System.out.println("############## Alunos ###################################");
		for(Aluno a : alunos) {
			Date dataAtual  = new Date();
			int idade = calcularIdade(a.getDataNascimento(),dataAtual);
			System.out.println("Nome.: " + a.getNome() + " CPF.: " + a.getCpf() + " Idade.: " + idade);
		}
		System.out.println("#########################################################");
	}
}
