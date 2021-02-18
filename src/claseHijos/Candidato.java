package claseHijos;

import java.io.File;

import clasePadre.Persona;

public class Candidato extends Persona{
	private int cod;
	private Partido partido;
	private String foto;

	public Candidato(int cod, int dni, String nombre, String apellido, int edad, String sexo,Partido partido,String foto) {
		super(dni, nombre, apellido, edad, sexo);
		this.cod = cod;
		this.partido=partido;
		this.foto=foto;
	}
	public Candidato(int cod, int dni, String nombre, String apellido, int edad, String sexo,Partido partido) {
		super(dni, nombre, apellido, edad, sexo);
		this.cod = cod;
		this.partido=partido;
	}

	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public Candidato(int cod) {
		super();
		this.cod = cod;
	}


	public int getCódigo_candidato() {
		return cod;
	}

	public void setCódigo_candidato(int cod) {
		this.cod = cod;
	}
	
}
