import java.util.ArrayList;

public class Recepcionista extends Funcionario{
	private ArrayList<Horario> horarios;
	
	public Recepcionista() {
		horarios = new ArrayList<Horario>();
	}
	
	public void addHorario(Horario h) {
		horarios.add(h);
	}
	public void removeHorario(Horario h) {
		horarios.remove(h);
	}
	public ArrayList<Horario> getHorarios(){
		return horarios;
	}
	
	
}
