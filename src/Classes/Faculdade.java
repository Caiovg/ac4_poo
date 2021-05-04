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
		
		try {
				BufferedReader lerEstudantes = new BufferedReader(new FileReader(nomeArquivoEstudantes));
				BufferedReader lerDisciplinas = new BufferedReader(new FileReader(nomeArquivoDisciplinas));
				BufferedReader lerMatriculas = new BufferedReader(new FileReader(nomeArquivoMatriculas));
	
				String linha = "";
				//Le o arquivo estudantes
				while((linha = lerEstudantes.readLine()) != null){
					String[] dadosAlunos = linha.split(":");
					long id = Long.parseLong(dadosAlunos[0]);
					String nome = dadosAlunos[1];
					String email = dadosAlunos[2];
					Estudantes estudante = new Estudantes(id, nome, email);
					estudantes.add(estudante);
				}
				lerEstudantes.close();
				//Le o arquivo disciplinas
				while((linha = lerDisciplinas.readLine()) != null){
					String[] dadosDisciplinas = linha.split(":");
					String codigo = dadosDisciplinas[0];
					int creditos = Integer.parseInt(dadosDisciplinas[1]);
					//Estudantes estudantes = new Estudantes(id, nome, email);
					disciplinas.add(new Disciplina(codigo, creditos));
				}
				lerDisciplinas.close();
				//Le o arquivo matricula
				while((linha = lerMatriculas.readLine()) != null){
					String[] dadosDisciplinas = linha.split(":");
					long codigoAluno = Long.parseLong(dadosDisciplinas[0]);
					String codigoDisciplina = dadosDisciplinas[1];
					//Busca o aluno
					Estudantes estudantesRef = null;
					//instancia de um esstudante nulo
					for(Estudantes estudante : estudantes) {
						if(estudante.getId_estudante() == codigoAluno) {
							estudantesRef = estudante;
						}
					}
					//Busca a disciplina que possue o codigo informado 
					Disciplina disciplinaRef = null;
					
					for(Disciplina disciplina : disciplinas ) {
						if(disciplina.getCodigo_disciplina().equals(codigoDisciplina)) {
							disciplinaRef = disciplina;
						}
					}
					
					if(disciplinaRef == null || estudantesRef == null) {
						System.out.println("Aluno ou disciplina não encontrado");
					}else {
						Matricula matricula = new Matricula(estudantesRef, disciplinaRef);
						estudantesRef.addMatricula(matricula);
						disciplinaRef.addMatricula(matricula);
					}
					
				}
		}catch (IOException ex){
            Logger.getLogger(Faculdade.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
}
