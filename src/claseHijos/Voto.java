package claseHijos;

public class Voto {
	private String certificado,departamentoV;
	private int fecha,periodo_elección;
	private Candidato candidato_Voto;
	private Partido partido_Voto;
	
	public Voto(String certificado, int fecha,
			int periodo_elección) {
		this.certificado = certificado;
		this.fecha = fecha;
		this.periodo_elección = periodo_elección;
	}
	
	public String getCertificado() {
		return certificado;
	}
	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}
	public String getDepartamentoV() {
		return departamentoV;
	}
	public void setDepartamento(String departamentoV) {
		this.departamentoV = departamentoV;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public int getPeriodo_elección() {
		return periodo_elección;
	}
	public void setPeriodo_elección(int periodo_elección) {
		this.periodo_elección = periodo_elección;
	}
	
	//Agregación
	public Candidato getCandidato_Voto(){
		return candidato_Voto;
	}
	
	public void setCandidato_Voto(Candidato candidato_Voto){
		this.candidato_Voto=candidato_Voto;
	}
	
	public Partido getPartido_Voto(){
		return partido_Voto;
	}
	
	public void setPartido_Voto(Partido partido_Voto){
		this.partido_Voto=partido_Voto;
	}
}
