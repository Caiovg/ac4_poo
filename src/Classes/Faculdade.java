package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Faculdade {

	//Atributos
	private String nome_faculdade;
	private List<Estudantes> estudantes;
	private List<Disciplina> disciplinas;
	
	//Metodos Get e Set
	public String getNome_faculdade() {
		return nome_faculdade;
	}
	public void setNome_faculdade(String nome_faculdade) {
		this.nome_faculdade = nome_faculdade;
	}
	public List<Estudantes> getEstudantes() {
		return estudantes;
	}
	public void setEstudantes(List<Estudantes> estudantes) {
		this.estudantes = estudantes;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	//metodos
	public Faculdade(String nomeFaculdadeEsperado) {
		this.nome_faculdade = nomeFaculdadeEsperado;
		this.estudantes = new ArrayList<>();
		this.disciplinas = new ArrayList<>();
	}
	
	public void carregarDadosArquivo(String nomeArquivoEstudantes, String nomeArquivoDisciplinas,
			String nomeArquivoMatriculas) {
		
		
		
	}
	
	
	

}
