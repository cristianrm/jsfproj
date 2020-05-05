package br.com.estudo.jsf.model;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.estudo.jsf.model.enums.Turno;

@Named
@RequestScoped
public class Estudante implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nome = "Cristian";
	private String sobreNome = " Ribeiro Mietlicki";
	private Double nota1 = 20.0;
	private Double nota2;
	private Double nota3 = 10.0;
	private Turno turno = Turno.MATUTINO;

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

}
