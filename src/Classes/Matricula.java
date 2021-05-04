package Classes;

public class Matricula {

	//Atributos
	private Estudantes estudante;
	private Disciplina disciplina;
	
	
	
	
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
		this.disciplina = disciplina;
	}




	public Matricula(Estudantes estudantes, Disciplina disciplinas) {
		this.estudante = estudantes;
		this.disciplina = disciplinas;
	}
}
