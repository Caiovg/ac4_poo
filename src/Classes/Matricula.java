package Classes;

public class Matricula {

	//Atributos
	private Estudantes estudante;
	private Disciplina disciplina;
	
	//Metodos Get e Set
	public Estudantes getEstudante() {
		return estudante;
	}
	public void setEstudante(Estudantes estudante) {
		this.estudante = estudante;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		disciplina = disciplina;
	}
	
	
	public void Matricula(Estudantes estudantes, Disciplina disciplinas) {
		
		this.estudante = estudantes;
		this.disciplina = disciplinas;
	}
}
