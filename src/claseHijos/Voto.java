package claseHijos;

public class Voto {
	private String certificado,departamentoV;
	private int fecha,periodo_elecci�n;
	private Candidato candidato_Voto;
	private Partido partido_Voto;
	
	public Voto(String certificado, int fecha,
			int periodo_elecci�n) {
		this.certificado = certificado;
		this.fecha = fecha;
		this.periodo_elecci�n = periodo_elecci�n;
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
	public int getPeriodo_elecci�n() {
		return periodo_elecci�n;
	}
	public void setPeriodo_elecci�n(int periodo_elecci�n) {
		this.periodo_elecci�n = periodo_elecci�n;
	}
	
	//Agregaci�n
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
