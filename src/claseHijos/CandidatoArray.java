package claseHijos;

import java.util.ArrayList;

public class CandidatoArray {
	private ArrayList<Candidato> candidatoA;

	public CandidatoArray() {
		PartidoArray par =new PartidoArray();
		candidatoA=new ArrayList<Candidato>();
		Adicionar(new Candidato(1, 76515667, "Junior", "Mendez", 25, "M",par.Obtener(0),"C://Users//Usuario//Pictures//Carpeta.jpg"));
		Adicionar(new Candidato(2, 76515667, "Pedro", "Mendez", 25, "M",par.Obtener(1),"C://Users//Usuario//Pictures//navidad.jpg"));
		Adicionar(new Candidato(3, 76515667, "Junior", "Mendez", 25, "M",par.Obtener(2),"C://Users//Usuario//Pictures//Carpeta.jpg"));
		Adicionar(new Candidato(4, 76515667, "Junior", "Mendez", 25, "M",par.Obtener(3),"C://Users//Usuario//Pictures//Carpeta.jpg"));
		Adicionar(new Candidato(5, 76515667, "Junior", "Mendez", 25, "M",par.Obtener(4),"C://Users//Usuario//Pictures//Carpeta.jpg"));
	
	}
	
	public void Adicionar(Candidato x){
		candidatoA.add(x);
	}
	
	public int tamaño(){
		return candidatoA.size();
	}
	
	public Candidato Obtener(int i){
		return candidatoA.get(i);
	}
	
	public Candidato buscar(int cod_Candidato) {
		Candidato x;
		for (int i=0; i<tamaño(); i++){
			x=Obtener(i);
		if(x.getCódigo_candidato()==cod_Candidato)
			return x;
	}
		return null;
	}
	public Candidato buscar(String par) {
		Candidato x;
		for (int i=0; i<tamaño(); i++){
			x=Obtener(i);
		if(x.getPartido().getNom_part()==par)
			return x;
	}
		return null;
	}
	
	public void eliminar(Candidato x) {
		candidatoA.remove(x);
	}
	
	public void modificar(Candidato x,int i){	
		candidatoA.set(i,x);
	}
	
	public int ContarDigitos(Candidato x){
		int código=x.getCódigo_candidato(); 
	            int cifras= 0;
	            while(código!=0){        
	            	código = código/10;     
	                cifras++;         
	            }
		return cifras;
	}
}
