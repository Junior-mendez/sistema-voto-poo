package claseHijos;


public class Partido {
	private String nom_part;
	private String sigla;
	private String foto;

	
	public Partido(String nom_part, String sigla) {
		this.nom_part = nom_part;
		this.sigla = sigla;

	}
	public Partido(String nom_part, String sigla,String foto) {
		this.nom_part = nom_part;
		this.sigla = sigla;
		this.foto = foto;

	}

	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Partido() {
		
	}
	public String getNom_part() {
		return nom_part;
	}

	public void setNom_part(String nom_part) {
		this.nom_part = nom_part;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	

	
}
