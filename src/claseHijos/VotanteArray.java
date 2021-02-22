package claseHijos;

import java.util.ArrayList;

public class VotanteArray {
	private ArrayList<Votante> votanteA;
	
	public VotanteArray(){
		votanteA=new ArrayList<Votante>();
		Adicionar(new Votante(70456789,  "Juan", "Perez", 20,  "M","JP70456789juan","juan","juan"));
		
	}
	
	public void Adicionar(Votante x){
		votanteA.add(x);
	}
	
	public int tamaño(){
		return votanteA.size();
	}
	
	public Votante Obtener(int i){
		return votanteA.get(i);
	}
	
	public Votante buscar(String usuario_votante) {
		Votante x;
		for (int i=0; i<tamaño(); i++){
			x=Obtener(i);
		if(x.getUsuario_votante().equals(usuario_votante))
			return x;
	}	
		return null;
	}
	
	public Votante buscar(int dni_votante) {
		Votante x;
		for (int i=0; i<tamaño(); i++){
			x=Obtener(i);
		if(x.getDni()==dni_votante)
			return x;
	}	
		return null;
	}
	
	public void eliminar(Votante x) {
		votanteA.remove(x);
	}
	
	public void modificar(Votante x,int i){	
		votanteA.set(i,x);
	}
}
