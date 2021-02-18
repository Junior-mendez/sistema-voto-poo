package claseHijos;

import java.util.ArrayList;

public class EncargadoArray {

	private ArrayList<Encargado> encargadoA;

	public EncargadoArray() {
		encargadoA=new ArrayList<Encargado>();
		Adicionar(new Encargado(76515667,  "Junior", "Junior", 20,  "M","jota","jota"));
	}

	public void Adicionar(Encargado x){
		encargadoA.add(x);
	}
	
	public int tamaño(){
		return encargadoA.size();
	}
	
	public Encargado Obtener(int i){
		return encargadoA.get(i);
	}
	
	public Encargado buscar(String usuario_Encargado) {
		Encargado x;
		for (int i=0; i<tamaño(); i++){
			x=Obtener(i);
		if(x.getUsuario_encargado().equals(usuario_Encargado))
			return x;
	}
		return null;
	}
	
	public Encargado buscar(int dni_encargado) {
		Encargado x;
		for (int i=0; i<tamaño(); i++){
			x=Obtener(i);
		if(x.getDni()==dni_encargado)
			return x;
	}	
		return null;
	}
	
	public void eliminar(Encargado x) {
		encargadoA.remove(x);
	}
	
	public void modificar(Encargado x,int i){	
		encargadoA.set(i,x);
	}
	
}
