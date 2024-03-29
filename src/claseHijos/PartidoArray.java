package claseHijos;

import java.util.ArrayList;

public class PartidoArray {
	private ArrayList<Partido> partidoA;
	
	public PartidoArray() {
		partidoA=new ArrayList<Partido>();
		Adicionar(new Partido("Partido Aprista Peruano","APRA",System.getProperty("user.dir")+"/src/resources/"+"apra.png"));
		Adicionar(new Partido("Accion Popular","AP",System.getProperty("user.dir")+"/src/resources/"+"accion.png"));
		
	}
	
	public void Adicionar(Partido x){
		partidoA.add(x);
	}
	
	public int tama�o(){
		return partidoA.size();
	}
	
	public Partido Obtener(int i){
		return partidoA.get(i);
	}
	
	public Partido buscar(String siglas_Encargado) {
		Partido x;
		for (int i=0; i<tama�o(); i++){
			x=Obtener(i);
			if(x.getSigla().equals(siglas_Encargado))	return x;
		}	
		return null;
	}
	public Partido buscarNom(String nomb) {
		Partido x;
		for (int i=0; i<tama�o(); i++){
			x=Obtener(i);
			if(x.getNom_part().equals(nomb))	{
				return x;
			}
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
