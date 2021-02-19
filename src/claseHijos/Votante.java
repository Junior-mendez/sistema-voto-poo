package claseHijos;

import clasePadre.Persona;

public class Votante extends Persona{
	private String usuario_votante, clave_votante,certificado;
	private Voto voto_Votante;
	
	public Votante(int dni, String nombre, String apellido, int edad, String sexo, String certificado,
			String usuario_votante, String clave_votante) {
		super(dni, nombre, apellido, edad, sexo);
		this.usuario_votante = usuario_votante;
		this.clave_votante = clave_votante;
		this.certificado = certificado;
		int fecha = 0;
		int periodo_elección=0;
		voto_Votante=new Voto(certificado,fecha,periodo_elección);
	}
	
	public String getUsuario_votante() {
		return usuario_votante;
	}	

	public String getCertificado() {
		return certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

	public void setUsuario_votante(String usuario_votante) {
		this.usuario_votante = usuario_votante;
	}
	
	public String getClave_votante() {
		return clave_votante;
	}

	public void setClave_votante(String clave_votante) {
		this.clave_votante = clave_votante;
	}
	
	/*Composición*/
	public Voto getVotoVotante(){
		return voto_Votante;
	}
	
	public void setVotoVotante(Voto voto_Votante){
		this.voto_Votante=voto_Votante;
	}
	
	public String CambioClave(String x){
		return clave_votante=x;
	}

	public int getDni() {
		// TODO Auto-generated method stub
		return dni;
	}
	
	
}
