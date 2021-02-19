package claseHijos;

import clasePadre.Persona;

public class Encargado extends Persona{
	private String antecedente,usuario_encargado, clave_encargado;
	private Voto voto_Encargado;

	public Encargado(int dni, String nombre, String apellido, int edad, String sexo,
			 String usuario_encargado, String clave_encargado) {
		super(dni, nombre, apellido, edad, sexo);
	
		this.usuario_encargado = usuario_encargado;
		this.clave_encargado = clave_encargado;
	}

	public String getAntecedente() {
		return antecedente;
	}

	public void setAntecedente(String antecedente) {
		this.antecedente = antecedente;
	}

	public String getUsuario_encargado() {
		return usuario_encargado;
	}

	public void setUsuario_encargado(String usuario_encargado) {
		this.usuario_encargado = usuario_encargado;
	}

	public String getClave_encargado() {
		return clave_encargado;
	}

	public void setClave_encargado(String clave_encargado) {
		this.clave_encargado = clave_encargado;
	}
	
	public Voto getVotoEncargado(){
		return voto_Encargado;
	}
	
	public void setVotoEncargado(Voto voto_Encargado){
		this.voto_Encargado=voto_Encargado;
	}
	
	public String CambioClave(String x){
		return clave_encargado=x;
	}

	public int getDni() {
		// TODO Auto-generated method stub
		return dni;
	}
}
