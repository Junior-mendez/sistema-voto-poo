package claseHijos;

import java.util.ArrayList;

public class PartidoArray {
	private ArrayList<Partido> partidoA;
	
	public PartidoArray() {
		partidoA=new ArrayList<Partido>();
		Adicionar(new Partido("Alianza Para el Progreso","APP"));
		Adicionar(new Partido("Partido Popular Cristiano","PPC"));
		Adicionar(new Partido("Partido n Cristiano","PPC"));
		Adicionar(new Partido("Partido o Cristiano","PPC"));
		Adicionar(new Partido("Partido p Cristiano","PPC"));
		
	}
	
	public void Adicionar(Partido x){
		partidoA.add(x);
	}
	
	public int tamaño(){
		return partidoA.size();
	}
	
	public Partido Obtener(int i){
		return partidoA.get(i);
	}
	
	public Partido buscar(String siglas_Encargado) {
		Partido x;
		for (int i=0; i<tamaño(); i++){
			x=Obtener(i);
			if(x.getSigla().equals(siglas_Encargado))	return x;
		}	
		return null;
	}
	public Partido buscarNom(String nomb) {
		Partido x;
		for (int i=0; i<tamaño(); i++){
			x=Obtener(i);
			if(x.getNom_part().equals(nomb))	return x;
		}	
		return null;
	}
	
	public void eliminar(Partido x) {
		partidoA.remove(x);
	}
	
	public void modificar(Partido x,int i){	
		partidoA.set(i,x);
	}
	
}
