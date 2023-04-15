import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class NatalFitness {
	public static void main(String[] args) throws ParseException{
	Date dt = new Date();
	SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
	Funcionario p1 = new Professor();
	Funcionario p2 = new Professor();
	Funcionario r1 = new Recepcionista();
	Funcionario r2 = new Recepcionista();
	Aluno a1 = new Aluno();
	Aluno a2 = new Aluno();
	Horario h = new Horario();
	BancoDeDados BD = new BancoDeDados();
	Treino t = new Treino();
	
	a1.setNome("João");
	a1.setCpf("050.054.283-20");
	dt = formato.parse("01-01-1992");
	a1.setDataNascimento(dt);
	t.setAtividade("Musculação");
	t.setHorario("08:00");
	a1.addTreino(t);
	t = new Treino();
	t.setAtividade("Karatê");
	t.setHorario("18:00");
	a1.addTreino(t);
	BD.addAluno(a1);
	
	a2.setNome("Luíza");
	a2.setCpf("050.054.707-20");
	dt = formato.parse("05-05-1994");
	a2.setDataNascimento(dt);
	t = new Treino();
	t.setAtividade("Musculação");
	t.setHorario("14:00");
	a2.addTreino(t);
	t = new Treino();
	t.setAtividade("Natação");
	t.setHorario("08:00");
	a2.addTreino(t);
	BD.addAluno(a2);
	
	p1.setNome("Jonathan");
	p1.setMatricula(1);
	((Professor)p1).setTipo("Musculação");
	((Professor)p1).addAluno(a1);
	BD.addProfessor((Professor)p1);
	
	p2.setNome("Clara");
	p2.setMatricula(2);
	((Professor)p2).setTipo("Natação");
	((Professor)p2).addAluno(a2);
	BD.addProfessor((Professor)p2);
	
	r1.setNome("Larissa");
	r1.setMatricula(3);
	h.setDia("Segunda");
	h.setHora("12:00");
	((Recepcionista)r1).addHorario(h);
	h = new Horario();
	h.setDia("Quarta");
	h.setHora("18:00");
	((Recepcionista)r1).addHorario(h);
	BD.addRecepcionista((Recepcionista)r1);
	
	r2.setNome("Vanessa");
	r2.setMatricula(4);
	h = new Horario();
	h.setDia("Terça");
	h.setHora("06:00");
	((Recepcionista)r2).addHorario(h);
	h = new Horario();
	h.setDia("Sexta");
	h.setHora("14:00");
	((Recepcionista)r2).addHorario(h);
	BD.addRecepcionista((Recepcionista)r2);
	
	BD.listFuncionarios();
	BD.listProfessores();
	BD.listRecepcionistas();
	BD.listAlunos();
	}
}
