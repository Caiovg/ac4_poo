package Classes;

import java.util.ArrayList;
import java.util.List;

public class Estudantes {

	//Atributos
	private long id_estudante;
	private String nome_estudante;
	private String email_estudante;
	private List<Matricula> matriculas; 
	
	//Metodos Get e Set
	public long getId_estudante() {
		return id_estudante;
	}
	public void setId_estudante(long id_estudante) {
		this.id_estudante = id_estudante;
	}
	public List<Matricula> getMatriculas() {
		return matriculas;
	}
	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	public String getNome_estudante() {
		return nome_estudante;
	}
	public void setNome_estudante(String nome_estudante) {
		this.nome_estudante = nome_estudante;
	}
	public String getEmail_estudante() {
		return email_estudante;
	}
	public void setEmail_estudante(String email_estudante) {
		this.email_estudante = email_estudante;
	}
	
	public Estudantes(long id, String nome, String email) {
		
		this.id_estudante = id;
		this.nome_estudante = nome;
		this.email_estudante = email;
		this.matriculas = new ArrayList<>();
	}
	
	public List<Disciplina> getDisciplinasMatriculadas(){
		
		List<Disciplina> disciplinas = new ArrayList<>();
		for(Matricula matricula : matriculas){
			disciplinas.add(matricula.getDisciplina());
		}
		return disciplinas;
	}
	
	public void addMatricula(Matricula matricula) {
		this.matriculas.add(matricula);        
	} 
}
