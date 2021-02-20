package claseHijos;

import java.util.ArrayList;

public class CandidatoArray {
	private ArrayList<Candidato> candidatoA;

	public CandidatoArray() {
		PartidoArray par =new PartidoArray();
		candidatoA=new ArrayList<Candidato>();
		Adicionar(new Candidato(1, 76515667, "Junior", "Mendez", 25, "M",par.Obtener(0),"D://Documents//NUEVO PROYECTO FINAL//votoelectronico//src//resources//junior.jpg"));
		Adicionar(new Candidato(2, 42344434, "Pedro", "Mendez", 25, "M",par.Obtener(1),"D://Documents//NUEVO PROYECTO FINAL//votoelectronico//src//resources//partido.png"));
		Adicionar(new Candidato(3, 56766566, "Lucas", "Mendez", 25, "M",par.Obtener(2),"D://Documents//NUEVO PROYECTO FINAL//votoelectronico//src//resources//junior.jpg"));
		Adicionar(new Candidato(4, 32323233, "Pedro", "Mendez", 25, "M",par.Obtener(3),"D://Documents//NUEVO PROYECTO FINAL//votoelectronico//src//resources//junior.jpg"));
		Adicionar(new Candidato(5, 23423434, "Marcos", "Mendez", 25, "M",par.Obtener(4),"D://Documents//NUEVO PROYECTO FINAL//votoelectronico//src//resources//junior.jpg"));
	
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
	
}
